package com.yooking.harmony;

import com.yooking.harmony.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.LayoutScatter;
import ohos.agp.components.Text;
import ohos.agp.components.element.Element;
import ohos.agp.components.element.ElementContainer;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseAbilitySlice extends AbilitySlice {

    private Map<Integer, Component> viewMap;

    protected <T extends Component> T findById(int resId) {
        if (viewMap == null) {
            viewMap = new HashMap<>();
        }
        if (!viewMap.containsKey(resId)) {
            Component componentById = findComponentById(resId);
            viewMap.put(resId, componentById);
        }

        return (T) viewMap.get(resId);
    }

    protected void addClickedListener(Component.ClickedListener clickedListener, int... resIds) {
        for (int resId : resIds) {
            findById(resId).setClickedListener(clickedListener);
        }
    }


    protected void showToast(String toast) {
        new ToastDialog(this)
                .setText(toast)
                .setAlignment(LayoutAlignment.BOTTOM)
                .show();
    }
}
