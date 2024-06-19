package net.minecobbraft.item;


import net.minecobbraft.Minecobbraft;
import net.minecobbraft.item.custom.WandOfProhItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

// Helper class for Registering all the mods :D
public class Items {
    private static final Item WAND_OF_PROH = registerItem("wand_of_proh", new WandOfProhItem(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return  Registry.register(Registries.ITEM, Identifier.of(Minecobbraft.MOD_ID, name), item);
    }

    public static void registerAllItems(){
        Minecobbraft.LOGGER.info("Registering All Items");
    }
}
