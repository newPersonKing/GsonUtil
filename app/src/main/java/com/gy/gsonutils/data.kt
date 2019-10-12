package com.gy.gsonutils

data class Line(var typeName :String,/*类型名称*/
                var name : String,/*产线名称*/
                var id : String/*产线ID*/
);

data class Order( var id : String,
                  var orderName :String,
                  var orderCode :String,
                  var orderType : String,
                  var orderTypeName : String,
                  var orderDate : String,
                  var transmitTime : String,
                  var materialId : Long,
                  var unit : String,
                  var materialName:String,/*产品名称*/
                  var materialCode : String/*产品编码*/
);

/*mes工序*/
data class MesProcess(var sapProcessId : String,
                      var sapProcessCode : String,
                      var code : String,
                      var id : String
);

/*SMT 上料*/
data class SmtStation(var stance:String,/*站位*/
                      var materialName : String,/*物料名称*/
                      var materialNumber : String,/*物料编号*/
                      var specificationType : String/*feeder型号*/
);

data class ReceiveDetail(var recCode:String,/*发料单编号*/
                         var materialId:Long,/*物料编码 就是物料ID*/
                         var materialDesc :String,/*物料描述*/
                         var unit:String,/*单位*/
                         var backFlush:String,/*反冲标识*/
                         var stdQty : Long,/*标准数量*/
                         var reqQty : Long,/*申请数量*/
                         var sendQty:Long,/*发送数量*/
                         var warehouse : Long/*库房*/);


data class SFeederInfo(var code: String,/*Feeder编码*/
                       var type : String,/*Feeder型号*/
                       var alertNumber : Long,/*报警使用次数*/
                       var maxNumber : Long,/*最大使用次数*/
                       var useNumber : Long,/*已使用次数*/
                       var state : Long,/*现状态（1在库2已出库3已废弃）*/
                       var checkState : Long,/*检查结果（1通过2不通过）*/
                       var remark : String/*备注*/
);