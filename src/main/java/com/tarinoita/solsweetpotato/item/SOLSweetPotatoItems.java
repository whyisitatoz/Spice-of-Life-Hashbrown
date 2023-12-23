package com.tarinoita.solsweetpotato.item;

import com.tarinoita.solsweetpotato.SOLSweetPotato;
import com.tarinoita.solsweetpotato.item.foodcontainer.FoodContainerItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = SOLSweetPotato.MOD_ID, bus = MOD)
public final class SOLSweetPotatoItems
{

	@SubscribeEvent
	public static void registerItems(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.ITEMS,
				helper -> {
					helper.register(new ResourceLocation(SOLSweetPotato.MOD_ID, "food_book"),
							new FoodBookItem());
					helper.register(new ResourceLocation(SOLSweetPotato.MOD_ID, "lunchbag"),
							new FoodContainerItem(SOLSweetPotatoConfig.lunchbagSlots,"lunchbag"));
					helper.register(new ResourceLocation(SOLSweetPotato.MOD_ID, "lunchbox"),
							new FoodContainerItem(SOLSweetPotatoConfig.lunchboxSlots,"lunchbox"));
					helper.register(new ResourceLocation(SOLSweetPotato.MOD_ID, "golden_lunchbox"),
							new FoodContainerItem(SOLSweetPotatoConfig.goldenLunchboxSlots,"golden_lunchbox"));
					helper.register(new ResourceLocation(SOLSweetPotato.MOD_ID, "netherite_lunchbox"),
							new FoodContainerItem(SOLSweetPotatoConfig.netheriteLunchboxSlots,"netherite_lunchbox"));
				});
	}
}
