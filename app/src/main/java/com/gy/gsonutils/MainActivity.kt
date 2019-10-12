package com.gy.gsonutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cc.colorcat.gsonutil.GsonUtils
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    var json = "{\n" +
            "  \"success\": true,\n" +
            "  \"msg\": \"操作成功!\",\n" +
            "  \"data\": {\n" +
            "    \"feederSmtVOS\": [\n" +
            "      {\n" +
            "        \"id\": \"1000\",\n" +
            "        \"creatorId\": \"12\",\n" +
            "        \"updaterId\": \"12\",\n" +
            "        \"createTime\": \"2019-09-05 10:16:53\",\n" +
            "        \"updateTime\": \"2019-09-17 10:16:55\",\n" +
            "        \"isDel\": 0,\n" +
            "        \"creator\": null,\n" +
            "        \"updater\": null,\n" +
            "        \"productionCode\": \"123131\",\n" +
            "        \"productionName\": \"123123123\",\n" +
            "        \"materialListNumber\": \"123123\",\n" +
            "        \"nxtProgramName\": \"1231\",\n" +
            "        \"pcbVersion\": \"123\",\n" +
            "        \"xpfProgramName\": \"123\",\n" +
            "        \"screenNumber\": \"123\",\n" +
            "        \"stance\": \"132\",\n" +
            "        \"materialNumber\": \"13\",\n" +
            "        \"materialName\": \"13\",\n" +
            "        \"specificationType\": \"13\",\n" +
            "        \"singleMachine\": \"13\",\n" +
            "        \"mesProcessCode\": \"0007\",\n" +
            "        \"productionLine\": \"13\",\n" +
            "        \"productionOrder\": \"这是添加的第一个物料\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"prodOrderVO\": {\n" +
            "      \"id\": \"2\",\n" +
            "      \"creatorId\": \"123\",\n" +
            "      \"updaterId\": \"123\",\n" +
            "      \"createTime\": \"2019-09-17 14:24:42\",\n" +
            "      \"updateTime\": \"2019-09-17 22:24:51\",\n" +
            "      \"isDel\": 0,\n" +
            "      \"creator\": null,\n" +
            "      \"updater\": null,\n" +
            "      \"orderCode\": \"6000098\",\n" +
            "      \"factoryId\": 1,\n" +
            "      \"orderName\": \"订单名称01\",\n" +
            "      \"orderVersion\": \"dd01\",\n" +
            "      \"orderType\": \"订单类型名称001\",\n" +
            "      \"orderTypeName\": \"banbenhao1\",\n" +
            "      \"versionCode\": \"001\",\n" +
            "      \"orderDate\": \"2019-09-17 10:19:47\",\n" +
            "      \"transmitTime\": \"2019-09-17 10:19:55\",\n" +
            "      \"materialCode\": \"200071939\",\n" +
            "      \"unit\": \"个\",\n" +
            "      \"bomId\": 2,\n" +
            "      \"bomVersion\": \"v1\",\n" +
            "      \"routingId\": 2,\n" +
            "      \"routingVersion\": \"v3\",\n" +
            "      \"orderStatus\": \"2\",\n" +
            "      \"systemStatus\": \"01\",\n" +
            "      \"fromLotId\": 1,\n" +
            "      \"toLotId\": 3,\n" +
            "      \"projectId\": \"xiangmu001\",\n" +
            "      \"projectName\": \"项目名称1\",\n" +
            "      \"planStartTime\": \"2019-09-17 05:23:17\",\n" +
            "      \"planEndTime\": \"2019-09-17 13:23:24\",\n" +
            "      \"estimatedStartTime\": \"2019-09-17 05:23:17\",\n" +
            "      \"estimatedEndTime\": \"2019-09-17 05:53:17\",\n" +
            "      \"actualStartTime\": \"2019-09-17 16:23:51\",\n" +
            "      \"actualEndTimg\": \"2019-09-17 17:23:59\",\n" +
            "      \"orderQty\": 10,\n" +
            "      \"inputQty\": 3,\n" +
            "      \"reworkQty\": 1,\n" +
            "      \"scrapQty\": 2,\n" +
            "      \"isConfLine\": null,\n" +
            "      \"lineNumber\": 5,\n" +
            "      \"pieceQty\": null,\n" +
            "      \"materialName\": \"装配组件,RDCU-1A/G1-DY01(DC220V CM1 单PT 1A\",\n" +
            "      \"sapName\": null,\n" +
            "      \"mesName\": null,\n" +
            "      \"mesCode\": null\n" +
            "    },\n" +
            "    \"smtCheck\": {\n" +
            "      \"id\": \"631860366405795840\",\n" +
            "      \"creatorId\": null,\n" +
            "      \"updaterId\": null,\n" +
            "      \"createTime\": null,\n" +
            "      \"updateTime\": null,\n" +
            "      \"isDel\": null,\n" +
            "      \"creator\": null,\n" +
            "      \"updater\": null,\n" +
            "      \"checkTime\": \"2019-09-17\",\n" +
            "      \"orderCode\": \"6000098\",\n" +
            "      \"mesProcess\": \"0007\",\n" +
            "      \"materialCode\": \"FLD2019924143911755\",\n" +
            "      \"barCode\": \"110\",\n" +
            "      \"feederCode\": \"SFD0001\",\n" +
            "      \"feederType\": \"1\",\n" +
            "      \"lineName\": \"产线2\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"state\": 1\n" +
            "}"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var jsonObject = JSONObject(json)
        var data = jsonObject.getJSONObject("data");
        var smtCheckStr = data.opt("smtCheck").toString()
        var feederSmtVOStr = data.opt("feederSmtVOS").toString()
        var prodOrderVOStr = data.opt("prodOrderVO").toString()

        var feederSmts = GsonUtils.jsonToList<SmtStation>(feederSmtVOStr, Array<out SmtStation>::class.java)


    }
}
