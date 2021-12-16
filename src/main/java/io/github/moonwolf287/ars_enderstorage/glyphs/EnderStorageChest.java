package io.github.moonwolf287.ars_enderstorage.glyphs;

import com.hollingsworth.arsnouveau.api.spell.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Set;

public class EnderStorageChest extends AbstractEffect {

    public static final EnderStorageChest INSTANCE = new EnderStorageChest("enderstorage_chest", "EnderStorage Chest");

    public EnderStorageChest(String tag, String description) {
        super(tag, description);
    }

    @Override
    public void onResolve(RayTraceResult rayTraceResult, World world, @Nullable LivingEntity shooter, SpellStats spellStats, SpellContext spellContext) {
        super.onResolve(rayTraceResult, world, shooter, spellStats, spellContext);
        System.out.println("Hello from my resolve!");
    }

    @Override
    public String getBookDescription() {
        return "Opens an EnderStorage ender chest inventory from anywhere. The Frequency depends on the Color Augment" +
               " modifiers.";
    }

    @Override
    public int getManaCost() {
        return 100;
    }

    @Nonnull
    @Override
    public Set<AbstractAugment> getCompatibleAugments() {
        //To add more we need to concat arrays with (for example) org.apache.commons.lang3.ArrayUtils.addAll()
        return augmentSetOf(AugmentColor.getAllAugmentColor());
    }

    @Nonnull
    @Override
    public Set<SpellSchool> getSchools() {
        return setOf(SpellSchools.MANIPULATION);
    }
}