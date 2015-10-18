package com.pixate.freestyle.styling.stylers;

import com.pixate.freestyle.annotations.PXDocProperty;
import com.pixate.freestyle.annotations.PXDocStyler;
import com.pixate.freestyle.styling.PXDeclaration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Martin on 10/16/15.
 */
@PXDocStyler(
        properties = {
                @PXDocProperty(name = "--inner-border", syntax = "<width> || <paint>")
        }
)
public class SPPointsIndicatorStyler extends PXStylerBase {

    private Map<String, PXDeclarationHandler> declarationHandlers;

    public SPPointsIndicatorStyler(PXStylerInvocation invocation) {
        super(invocation);
    }

    @Override
    public Map<String, PXDeclarationHandler> getDeclarationHandlers() {

        synchronized (SPPointsIndicatorStyler.class) {
            if(declarationHandlers == null) {
                declarationHandlers = new HashMap<>();

                declarationHandlers.put("inner-border", new PXDeclarationHandler() {
                    @Override
                    public void process(PXDeclaration declaration, PXStylerContext stylerContext) {
                        SPStylerContext.ProgressIndicatorStyle style = new SPStylerContext.ProgressIndicatorStyle();

                        style.setInnerBorder(
                                declaration.getSizeValue(stylerContext.getDisplayMetrics()).width
                        );

                        stylerContext.getSPStylerContext().setProgressIndicatorStyle(style);
                    }
                });
            }

        }

        return declarationHandlers;
    }
}
