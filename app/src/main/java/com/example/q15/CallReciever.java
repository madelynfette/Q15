package com.example.q15;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.lifecycle.MutableLiveData;

public class CallReciever extends BroadcastReceiver {

    private MutableLiveData<String> callInformation;

    public CallReciever(MutableLiveData<String> callInfo) {
        this.callInformation = callInformation;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        String pNumber = null;
        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            pNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);
        }

        if (pNumber !=null) {
            Intent intentcall = new Intent(context, MainActivity.class);
            intentcall.putExtra("number", pNumber);
            context.startActivity(intentcall);
        }
    }
}
