package design.deerlight.example;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.content.res.Resources.Theme;

import java.util.Locale;

/**
 * Created by samuel_hsieh on 2017/9/14.
 */
public class ActionBarTitleColorHelper {

    public static Spanned setColor(Context context, String title, int colorResId, Theme theme) {
        Spanned htmlString = null;
        try {
            int colorId = 0;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                colorId = context.getResources().getColor(colorResId, theme);
            } else {
                colorId = context.getResources().getColor(colorResId);
            }
            String htmlColor = String.format(Locale.US, "#%06X", (0xFFFFFF & Color.argb(0, Color.red(colorId),
                    Color.green(colorId), Color.blue(colorId))));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                htmlString = Html.fromHtml("<font color='" + htmlColor + "'>" + title + "</font>", Html.FROM_HTML_MODE_LEGACY);
            } else {
                htmlString = Html.fromHtml("<font color='" + htmlColor + "'>" + title + "</font>");
            }
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        } finally {
            return htmlString;
        }
    }
}
