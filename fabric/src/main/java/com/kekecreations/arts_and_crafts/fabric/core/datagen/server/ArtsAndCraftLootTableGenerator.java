package com.kekecreations.arts_and_crafts.fabric.core.datagen.server;

import com.kekecreations.arts_and_crafts.core.registry.KekeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.item.DyeColor;

public class ArtsAndCraftLootTableGenerator extends FabricBlockLootTableProvider {

    public ArtsAndCraftLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }


    @Override
    public void generate() {
        terracottaShingles();
        chalk();

    }

    private void terracottaShingles() {
        for (DyeColor colours : DyeColor.values()) {
            dropSelf(KekeBlocks.getDyedTerracottaShingles(colours));
            dropSelf(KekeBlocks.getDyedTerracottaShingleStairs(colours));
            dropSelf(KekeBlocks.getDyedTerracottaShingleSlab(colours));
            dropSelf(KekeBlocks.getDyedTerracottaShingleWall(colours));
        }
        dropSelf(KekeBlocks.TERRACOTTA_SHINGLES.get());
        dropSelf(KekeBlocks.TERRACOTTA_SHINGLE_SLAB.get());
        dropSelf(KekeBlocks.TERRACOTTA_SHINGLE_WALL.get());
        dropSelf(KekeBlocks.TERRACOTTA_SHINGLE_STAIRS.get());
    }

    private void chalk() {
        for (DyeColor colours : DyeColor.values()) {
            dropSelf(KekeBlocks.getChalk(colours));
            dropSelf(KekeBlocks.getChalkStairs(colours));
            dropSelf(KekeBlocks.getChalkSlab(colours));
            dropSelf(KekeBlocks.getChalkWall(colours));
        }
    }
}