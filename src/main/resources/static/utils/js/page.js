// 分页查询对象
var iPage = {
    url : "",
    //当前页面
    pageIndex: 1,

    //当前页面数据条数
    pageSize: 3,

    //每页数据条数数组
    pageSizeList:[3,4,5,6,7],

    //最大页面
    maxPage: 1,

    //页码
    pageList:[],

    //判断数据
    dataList: [],

    //返回的条数
    dataCount:'',
    //搜索数据
    sd:{},

    //上一页
    up:function () {
        iPage.pageIndex = iPage.pageIndex - 1;
        if(iPage.pageIndex < 1){
            iPage.pageIndex = 1;
            layer.msg("第一页！",{icon: 7});
            return
        }
        iPage.getData();
    },
    //下一页
    down:function () {
        iPage.pageIndex = iPage.pageIndex + 1;
        if(iPage.pageIndex > iPage.maxPage){
            iPage.pageIndex = iPage.maxPage;
            layer.msg("最后一页！",{icon: 7});
            return
        }
        iPage.getData();
    },
    //计算页码
    runPage: function(){
        iPage.pageList = [];
        for (var i = 1;i <= iPage.maxPage;i++){
            iPage.pageList.push(i);
        }
        console.log(iPage.pageList);
    },
    //转跳到指定页码
    goPage: function(pageIndex){
        iPage.pageIndex = pageIndex;
        iPage.getData();
    },
    //改变每页数据条数
    changeSize: function(size){
        iPage.pageSize = size;
        iPage.getData();
    },
    //搜索
    doSearch:function(){
        iPage.pageIndex = 1;
        iPage.getData();
        layer.msg("搜索完毕！")
    },
    //分页
    getData: function() {
        $.ajax({
            url: iPage.url,
            type:"POST",
            dataType:"JSON",
            data:{
                "pageIndex": iPage.pageIndex,
                "pageSize": iPage.pageSize,
                "sd": JSON.stringify(iPage.sd)
            },
            success:function (resp) {
                iPage.maxPage = resp.maxPage;
                iPage.dataList = resp.dataList;
                iPage.dataCount = resp.dataCount;
                iPage.runPage();
            },
            error:function (resp) {
                layer.alert("系统错误");
            }
        })
    },
    //初始化方法
    init: function (url) {
        iPage.url = url;
        iPage.getData();
    }
}