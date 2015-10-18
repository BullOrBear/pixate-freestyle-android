package com.pixate.freestyle.styling.adapters;

/**
 * Created by Martin on 10/18/15.
 */
public class SPStyleAdapter {

    public static void attachCustomStyleAdapters() {
        PXStyleAdapter.registerStyleAdapter("com.bullorbear.android.advokit_retail.widgets.PointsIndicator_", SPPointsIndicatorStyleAdapter.getInstance());
        PXStyleAdapter.registerStyleAdapter("com.bullorbear.android.advokit_retail.widgets.PointsIndicator", SPPointsIndicatorStyleAdapter.getInstance());
    }
}
