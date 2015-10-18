package com.pixate.freestyle.styling.stylers;

/**
 * Created by Martin on 10/18/15.
 */
public class SPStylerContext {

    private ProgressIndicatorStyle progressIndicatorStyle;

    public ProgressIndicatorStyle getProgressIndicatorStyle() {
        return progressIndicatorStyle;
    }

    public void setProgressIndicatorStyle(ProgressIndicatorStyle progressIndicatorStyle) {
        this.progressIndicatorStyle = progressIndicatorStyle;
    }

    public static class ProgressIndicatorStyle {
        private float innerBorder;

        public float getInnerBorder() {
            return innerBorder;
        }

        public void setInnerBorder(float innerBorder) {
            this.innerBorder = innerBorder;
        }
    }
}
