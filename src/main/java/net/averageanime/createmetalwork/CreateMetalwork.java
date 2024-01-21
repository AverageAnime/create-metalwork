package net.averageanime.createmetalwork;

import net.averageanime.createmetalwork.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.averageanime.createmetalwork.fluid.ModFluids.register;

public class CreateMetalwork implements ModInitializer {
	public static final String MOD_ID = "createmetalwork";

	public static final Logger LOGGER = LoggerFactory.getLogger("createmetalwork");

	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "group"));

	@Override
	public void onInitialize() {

				Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
						.displayName(Text.translatable("itemgroup.createmetalwork"))
						.icon(() -> new ItemStack(ModItems.ICON))
						.entries(((displayContext, entries) -> {
							entries.add(ModItems.CRUSHEDNETHERITESCRAP);
						}))
						.build());

		ModItems.registerModItems();
		register();
	}
}

