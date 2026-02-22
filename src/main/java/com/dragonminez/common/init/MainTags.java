package com.dragonminez.common.init;

import com.dragonminez.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class MainTags {
	public static class Biomes {
		public static final TagKey<Biome> IS_NAMEK = create("is_namekworld");
        public static final TagKey<Biome> IS_SACREDLAND = create("is_sacredland");
        public static final TagKey<Biome> IS_HTC = create("is_htc");
        public static final TagKey<Biome> IS_OTHERWORLD = create("is_otherworld");
        public static final TagKey<Biome> HAS_DINOSAURS = create("has_dinosaurs");
        public static final TagKey<Biome> HAS_SABERTOOTH = create("has_sabertooth");
        public static final TagKey<Biome> HAS_ROBOTS = create("has_robots");
        public static final TagKey<Biome> IS_ROCKYBIOME = create("is_rockybiome");

		private static TagKey<Biome> create(String name) {
			return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, name));
		}
	}

	public static class Blocks {
		public static final TagKey<Block> NAMEK_ALOG = create("namek_alog");
        public static final TagKey<Block> NAMEK_SLOG = create("namek_slog");
        public static final TagKey<Block> NAMEKDEEPSLATE_REPLACEABLES = create("namek_deepslate_ore_replaceables");
        public static final TagKey<Block> NAMEKSTONE_REPLACEABLES = create("namek_stone_ore_replaceables");

		private static TagKey<Block> create(String name) {
		    return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, name));
		}
	}

	public static class Items {
		public static final TagKey<Item> NAMEK_ALOG = create("namek_alog");
        public static final TagKey<Item> NAMEK_SLOG = create("namek_slog");
		public static final TagKey<Item> HIDE_HAIR = create("hide_hair");

		private static TagKey<Item> create(String name) {
		    return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, name));
		}
	}
}
