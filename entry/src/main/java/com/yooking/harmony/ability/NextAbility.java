package com.yooking.harmony.ability;

import com.yooking.harmony.BaseAbilitySlice;
import com.yooking.harmony.ResourceTable;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;

public class NextAbility extends Ability {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        setMainRoute(NextAbilitySlice.class.getName());
    }

    public static class NextAbilitySlice extends BaseAbilitySlice {
        @Override
        protected void onStart(Intent intent) {
            super.onStart(intent);
            super.setUIContent(ResourceTable.Layout_ability_next);
            initListener();
        }

        private void initListener() {
            addClickedListener(new Component.ClickedListener() {
                @Override
                public void onClick(Component component) {
                    switch (component.getId()){
                        case ResourceTable.Id_btn_next_top:
                            showToast("点击了顶层按钮1");
                            break;
                        case ResourceTable.Id_btn_next_center:
                            showToast("点击了中层按钮2");
                            break;
                        case ResourceTable.Id_btn_next_bottom:
                            showToast("点击了底层按钮3");
                            break;
                    }
                }
            },ResourceTable.Id_btn_next_top,ResourceTable.Id_btn_next_center,ResourceTable.Id_btn_next_bottom);
        }
    }
}
