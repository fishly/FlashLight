package enjoytoday.com;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by hfcai on 05/03/17.
 * control background run flashlight.
 */

public class FlashLightService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
