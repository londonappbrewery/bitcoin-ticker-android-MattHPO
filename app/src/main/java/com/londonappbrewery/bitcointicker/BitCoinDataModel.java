package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yanghaobo on 29/01/2018.
 */

public class BitCoinDataModel {

    private String mLastPrice;


    public static BitCoinDataModel fromJSON(JSONObject jsonObject){

        if (jsonObject != null) {

            BitCoinDataModel bitCoinData = new BitCoinDataModel();
            try {
                bitCoinData.mLastPrice = jsonObject.getString("last");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return bitCoinData;
        }
        else {

            return null;
        }
    }

    public String getLastPrice() {
        return mLastPrice;
    }
}
