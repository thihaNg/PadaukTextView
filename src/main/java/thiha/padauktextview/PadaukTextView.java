package thiha.padauktextview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Thiha on 11/29/2017.
 */

public class PadaukTextView extends AppCompatTextView {

    TypefaceSingleton typefaceSingleton;

    public PadaukTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        int fontStyle = getTypeface().getStyle();
        String text = getText().toString();
        typefaceSingleton = TypefaceSingleton.getInstance(context);

        setText(Rabbit.zg2uni(text));

        if(fontStyle == Typeface.BOLD) {

            setTypeface(typefaceSingleton.getBoldTypeface());

        }

        else {

            setTypeface(typefaceSingleton.getNormalTypeface());

        }

    }

}
