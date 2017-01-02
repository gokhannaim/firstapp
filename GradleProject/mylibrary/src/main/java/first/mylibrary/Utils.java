package first.mylibrary;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import java.net.InetAddress;

public class Utils {

    public static boolean isNetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("google.com");
            return !ipAddr.equals("");

        } catch (Exception e) {
            return false;
        }
    }

    public static AlertDialog.Builder alertDialog(Context context, String title, String message, int resId) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setMessage(message).setIcon(resId);
        return builder;
    }

    public static Toast createToast(Context context, String message) {
        return Toast.makeText(context, message, Toast.LENGTH_LONG);
    }
}
