package com.shuhao.gravitysensor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shuhao.gravitysceenmanager.GravitySensorManager;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GravitySensorManager.getInstance(this).setIsAutoRotate(false).setGravitySensorListener(new GravitySensorManager.GravitySensorListener() {
            @Override
            public void onLandscape() {

            }

            @Override
            public void onFlipLandscape() {

            }

            @Override
            public void onPortpait() {

            }

            @Override
            public void onFlipPortpait() {

            }
        });
    }

    /*@Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor == null) {
            return;
        }

        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            int x = (int) event.values[0];
            int y = (int) event.values[1];
            int z = (int) event.values[2];
            mCalendar = Calendar.getInstance();
            long stamp = mCalendar.getTimeInMillis() / 1000l;// 1393844912

            int second = mCalendar.get(Calendar.SECOND);// 53

            Log.e("onSensor", "pX:" + x + "  pY:" + y + "  pZ:" + z + "    stamp:"
                    + stamp + "  second:" + second);
            if (time != second) {
                if (x != y) {
                    if (Math.abs(x) > Math.abs(y)) {
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
                    } else {
                        if (y >= 0) {
                            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
                        }
                    }
                }
            }
            time = second;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }*/
}
