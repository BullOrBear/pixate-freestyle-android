package com.pixate.freestyle.styling.adapters;

import com.pixate.freestyle.cg.views.SPProgressIndicatorView;
import com.pixate.freestyle.styling.stylers.PXStyler;
import com.pixate.freestyle.styling.stylers.PXStylerBase;
import com.pixate.freestyle.styling.stylers.PXStylerContext;
import com.pixate.freestyle.styling.stylers.SPPointsIndicatorStyler;

import java.util.List;

/**
 * Created by Martin on 10/16/15.
 */
public class SPPointsIndicatorStyleAdapter extends PXViewStyleAdapter {
    private static SPPointsIndicatorStyleAdapter instance;

    @Override
    protected List<PXStyler> createStylers() {
        List<PXStyler> stylers = super.createStylers();

        stylers.add(new SPPointsIndicatorStyler(new PXStylerBase.PXStylerInvocation() {
            @Override
            public void invoke(Object view, PXStyler styler, PXStylerContext context) {
                SPProgressIndicatorView progressIndicatorView = (SPProgressIndicatorView) view;

                progressIndicatorView.setInnerBorder(
                        context.getSPStylerContext().getProgressIndicatorStyle().getInnerBorder()
                );
            }
        }));

        return stylers;
    }

    public static SPPointsIndicatorStyleAdapter getInstance() {
        if(instance == null) {
            instance = new SPPointsIndicatorStyleAdapter();
        }
        return instance;
    }
}
