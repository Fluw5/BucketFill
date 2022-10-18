package dev.fluw.bucketfill;

import dev.fluw.bucketfill.utils.HexCode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Methods {

    public static void fillMilk(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack milkBucket = new ItemStack(Material.MILK_BUCKET);
        player.getInventory().addItem(milkBucket);

    }

    public static void fillWater(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack waterBucket = new ItemStack(Material.WATER_BUCKET);
        player.getInventory().addItem(waterBucket);

    }

    public static void fillLava(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack lavaBucket = new ItemStack(Material.LAVA_BUCKET);
        player.getInventory().addItem(lavaBucket);

    }

    public static void fillPuffer(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack pufferBucket = new ItemStack(Material.PUFFERFISH_BUCKET);
        player.getInventory().addItem(pufferBucket);

    }

    public static void fillSalmon(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack salmonBucket = new ItemStack(Material.SALMON_BUCKET);
        player.getInventory().addItem(salmonBucket);

    }

    public static void fillCod(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack codBucket = new ItemStack(Material.COD_BUCKET);
        player.getInventory().addItem(codBucket);

    }

    public static void fillTropical(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack tropicalBucket = new ItemStack(Material.TROPICAL_FISH_BUCKET);
        player.getInventory().addItem(tropicalBucket);

    }

    public static void fillAxolotl(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack axolotlBucket = new ItemStack(Material.AXOLOTL_BUCKET);
        player.getInventory().addItem(axolotlBucket);

    }

    public static void fillPowderedSnow(Player player) {

        ItemStack emptyBucket = new ItemStack(Material.BUCKET);
        player.getInventory().removeItem(emptyBucket);
        ItemStack snowBucket = new ItemStack(Material.POWDER_SNOW_BUCKET);
        player.getInventory().addItem(snowBucket);

    }

    public static void getNoPermissionMessage(Player sender){

        String noPerm = BucketFill.getInstance().getConfig().getString("No-Permission");
        sender.sendMessage(HexCode.format(noPerm));

    }

    public static void getNoMoneyMessage(Player sender){

        String noMoney = BucketFill.getInstance().getConfig().getString("No-Money");
        sender.sendMessage(HexCode.format(noMoney));


    }

    public static void getNoBucketMessage(Player sender){

        String noBucket = BucketFill.getInstance().getConfig().getString("No-Bucket");
        sender.sendMessage(HexCode.format(noBucket));

    }

    public static void getReloadedMessage(Player sender){

        String reloadMsg = BucketFill.getInstance().getConfig().getString("Config-Reloaded");
        sender.sendMessage(HexCode.format(reloadMsg));

    }

    public static Double getMilkPrice(Player sender){

        Double milkCost = BucketFill.getInstance().getConfig().getDouble("Cost.Milk");
        return milkCost;

    }

    public static Double getWaterPrice(Player sender){

        Double waterCost = BucketFill.getInstance().getConfig().getDouble("Cost.Water");
        return waterCost;

    }

    public static Double getLavaPrice(Player sender){

        Double lavaCost = BucketFill.getInstance().getConfig().getDouble("Cost.Lava");
        return lavaCost;

    }

    public static Double getPufferPrice(Player sender){

        Double pufferCost = BucketFill.getInstance().getConfig().getDouble("Cost.Puffer");
        return pufferCost;

    }

    public static Double getSalmonPrice(Player sender){

        Double salmonCost = BucketFill.getInstance().getConfig().getDouble("Cost.Salmon");
        return salmonCost;

    }

    public static Double getCodPrice(Player sender){

        Double codCost = BucketFill.getInstance().getConfig().getDouble("Cost.Cod");
        return codCost;

    }

    public static Double getTropicalPrice(Player sender){

        Double tropicalCost = BucketFill.getInstance().getConfig().getDouble("Cost.Tropical");
        return tropicalCost;

    }

    public static Double getAxolotlPrice(Player sender){

        Double axolotlCost = BucketFill.getInstance().getConfig().getDouble("Cost.Axolotl");
        return axolotlCost;

    }

    public static Double getPowderedSnowPrice(Player sender){

        Double powderedSnowCost = BucketFill.getInstance().getConfig().getDouble("Cost.PowderedSnow");
        return powderedSnowCost;

    }

}
