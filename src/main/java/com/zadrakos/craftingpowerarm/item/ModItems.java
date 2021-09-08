package com.zadrakos.craftingpowerarm.item;

import com.zadrakos.craftingpowerarm.PowerArmourCraftingStuffs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PowerArmourCraftingStuffs.MOD_ID);

    public static final RegistryObject<Item> T51_HELM_SOFTCAST = ITEMS.register("t51_helm_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_CHEST_SOFTCAST = ITEMS.register("t51_chest_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_LEGS_SOFTCAST = ITEMS.register("t51_legs_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_BOOT_SOFTCAST = ITEMS.register("t51_boot_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_HELM_HARDCAST = ITEMS.register("t51_helm_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_CHEST_HARDCAST = ITEMS.register("t51_chest_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_LEGS_HARDCAST = ITEMS.register("t51_legs_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T51_BOOT_HARDCAST = ITEMS.register("t51_boot_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_HELM_SOFTCAST = ITEMS.register("t45_helm_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_CHEST_SOFTCAST = ITEMS.register("t45_chest_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_LEGS_SOFTCAST = ITEMS.register("t45_legs_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_BOOT_SOFTCAST = ITEMS.register("t45_boot_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_HELM_HARDCAST = ITEMS.register("t45_helm_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_CHEST_HARDCAST = ITEMS.register("t45_chest_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_LEGS_HARDCAST = ITEMS.register("t45_legs_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> T45_BOOT_HARDCAST = ITEMS.register("t45_boot_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_HELM_SOFTCAST = ITEMS.register("x01_helm_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_CHEST_SOFTCAST = ITEMS.register("x01_chest_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_LEGS_SOFTCAST = ITEMS.register("x01_legs_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_BOOT_SOFTCAST = ITEMS.register("x01_boot_softcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_HELM_HARDCAST = ITEMS.register("x01_helm_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_CHEST_HARDCAST = ITEMS.register("x01_chest_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_LEGS_HARDCAST = ITEMS.register("x01_legs_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> X01_BOOT_HARDCAST = ITEMS.register("x01_boot_hardcast",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static final RegistryObject<Item> BOTTLE_CAP = ITEMS.register("bottle_cap",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CRAFTINGPOWERARM_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
