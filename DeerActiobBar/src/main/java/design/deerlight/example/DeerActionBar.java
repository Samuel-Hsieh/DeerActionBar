package design.deerlight.example;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.text.Spanned;
import android.content.res.Resources.Theme;
import android.util.Log;

/**
 * Created by samuel_hsieh on 2017/9/14.
 */
public class DeerActionBar {

    private static final String TAG = DeerActionBar.class.getSimpleName();


    public static Maker with(Context context) {
        return new Maker(context);
    }

    public static class Maker {

        private DeerFactor factor;
        private Context context;

        public Maker(Context context) {
            factor = new DeerFactor();
            this.context = context;
        }

        public Maker setTitle(String title) {
            factor.title = title;
            return this;
        }

        public Maker setTitle(int resId) {
            factor.title = context.getString(resId);
            return this;
        }

        public Maker setTitleColor(int colorResId, Theme theme) {
            Spanned htmlString = ActionBarTitleColorHelper.setColor(context, factor.title, colorResId, theme);
            if (htmlString != null) {
                factor.htmlString = htmlString;
            } else {
                Log.d(TAG, "ActionBarTitleColorHelper return null : htmlString == " + htmlString);
            }
            return this;
        }

        public Maker setBackgroundDrawable(int resId) {
            Drawable drawable = context.getDrawable(resId);
            setBackgroundDrawable(drawable);
            return this;
        }

        public Maker setBackgroundDrawable(Drawable drawable) {
            factor.drawable = drawable;
            return this;
        }

        public void into(ActionBar actionBar) {
            actionBar.setTitle(factor.title);
            if (factor.htmlString != null) {
                actionBar.setTitle(factor.htmlString);
            }
            if (factor.drawable != null) {
                actionBar.setBackgroundDrawable(factor.drawable);
            }
        }
    }
}
