package thiha.padauktextview;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Thiha on 11/29/2017.
 */

public class TypefaceSingleton {

    public static TypefaceSingleton typefaceSingleton;
    Typeface boldTypeface, normalTypeface;
    Context context;

    private TypefaceSingleton(Context context) {

        this.context = context;
        boldTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/padauk_bold.ttf");
        normalTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/padauk.ttf");

    }

    public static TypefaceSingleton getInstance(Context context) {

        if(typefaceSingleton == null) {

            typefaceSingleton = new TypefaceSingleton(context);

        }

        return typefaceSingleton;
    }

    public Typeface getBoldTypeface() {


        return boldTypeface;
    }

    public Typeface getNormalTypeface() {


        return normalTypeface;
    }

}
