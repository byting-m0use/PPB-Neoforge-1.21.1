package com.blueprint_studios.ppb.blocks;

import com.blueprint_studios.ppb.PoppyPlaytimeBlueprintMod;
import com.blueprint_studios.ppb.blocks.entity.PlaytimeOsBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, PoppyPlaytimeBlueprintMod.MOD_ID);

    public static final Supplier<BlockEntityType<PlaytimeOsBlockEntity>> PLAYTIME_OS_BE =
            BLOCK_ENTITIES.register("playtime_os_be", () -> BlockEntityType.Builder.of(
                    PlaytimeOsBlockEntity::new, ModBlocks.PLAYTIME_OS.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
