package dev.fluw.bucketfill;

import dev.fluw.bucketfill.utils.HexCode;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,org.bukkit.command.Command command, String label, String[] args) {


        if (command.getName().equalsIgnoreCase("bucket")) {
            if (sender.hasPermission("bucketfill.command")) {
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    Economy economy = BucketFill.getEconomy();

                    if (args.length <1) {
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        sender.sendMessage(HexCode.format("&5Usage:"));
                        sender.sendMessage(HexCode.format("&d/bucket help"));
                        sender.sendMessage(HexCode.format("&d/bucket about"));
                        sender.sendMessage(HexCode.format("&d/bucket fill &7<Milk, Water, Lava, Puffer, Salmon, Cod, Tropical, Axolotl, PowderedSnow>"));
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        return true;

                    }

                    if (args.length ==1 && args[0].equalsIgnoreCase("fill")) {
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        sender.sendMessage(HexCode.format("&5Usage:"));
                        sender.sendMessage(HexCode.format("&d/bucket fill &7<Milk, Water, Lava, Puffer, Salmon, Cod, Tropical, Axolotl, PowderedSnow>"));
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        return true;

                    }

                    if (args.length ==1 && args[0].equalsIgnoreCase("help")) {
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        sender.sendMessage(HexCode.format("&5Usage:"));
                        sender.sendMessage(HexCode.format("&d/bucket about"));
                        sender.sendMessage(HexCode.format("&d/bucket fill &7<Milk, Water, Lava, Puffer, Salmon, Cod, Tropical, Axolotl, PowderedSnow>"));
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        return true;

                    }

                    if (args.length ==1 && args[0].equalsIgnoreCase("about")) {
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        sender.sendMessage(HexCode.format("&5Plugin Name: &7Bucket Fill v1.8"));
                        sender.sendMessage(HexCode.format("&5Author: &7Fluw"));
                        sender.sendMessage(HexCode.format("&5Website: &7&nhttps://fluw.dev/"));
                        sender.sendMessage(HexCode.format("&8&m---------------------------------------------"));
                        return true;

                    }

                    if (args.length ==1 && args[0].equalsIgnoreCase("reload")) {
                        if (sender.hasPermission("bucketfill.reload")) {
                            BucketFill.getInstance().reloadConfig();
                            Methods.getReloadedMessage((Player) sender);
                        } else Methods.getNoPermissionMessage((Player) sender);
                    }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Milk")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getMilkPrice((Player) sender) + " &adollars from your account. &6/bucket milk confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Milk") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getMilkPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with milk."));
                                    economy.withdrawPlayer(player,Methods.getMilkPrice((Player) sender));
                                    Methods.fillMilk(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Water")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getWaterPrice((Player) sender) + " &adollars from your account. &6/bucket water confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Water") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getWaterPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with water."));
                                    economy.withdrawPlayer(player,Methods.getWaterPrice((Player) sender));
                                    Methods.fillWater(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }


                    if (args.length >=2 && args[1].equalsIgnoreCase("Lava")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getLavaPrice((Player) sender) + " &adollars from your account. &6/bucket lava confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Lava") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getLavaPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with lava."));
                                    economy.withdrawPlayer(player,Methods.getLavaPrice((Player) sender));
                                    Methods.fillLava(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Puffer")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getPufferPrice((Player) sender) + " &adollars from your account. &6/bucket puffer confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Puffer") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getPufferPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with a Puffer Fish."));
                                    economy.withdrawPlayer(player,Methods.getPufferPrice((Player) sender));
                                    Methods.fillPuffer(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);
                                return true;
                            }
                            return true;
                        }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Salmon")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getSalmonPrice((Player) sender) + " &adollars from your account. &6/bucket salmon confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Salmon") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getSalmonPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with a Salmon."));
                                    economy.withdrawPlayer(player,Methods.getSalmonPrice((Player) sender));
                                    Methods.fillSalmon(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }


                    if (args.length >=2 && args[1].equalsIgnoreCase("Cod")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getCodPrice((Player) sender) + " &adollars from your account. &6/bucket cod confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Cod") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getCodPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with a Cod."));
                                    economy.withdrawPlayer(player,Methods.getCodPrice((Player) sender));
                                    Methods.fillCod(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Tropical")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getTropicalPrice((Player) sender) + " &adollars from your account. &6/bucket tropical confirm &ato continue"));
                        return true;
                    }

                        if (args.length >=2 && args[0].equalsIgnoreCase("Tropical") && args[1].equalsIgnoreCase("confirm")) {

                            if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                                if (economy.getBalance(player) >= Methods.getTropicalPrice((Player) sender)) {
                                    sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with a Tropical Fish."));
                                    economy.withdrawPlayer(player,Methods.getTropicalPrice((Player) sender));
                                    Methods.fillTropical(Objects.requireNonNull(((Player) sender).getPlayer()));
                                    return true;

                                } else Methods.getNoMoneyMessage((Player) sender);

                                return true;

                            } else {
                                Methods.getNoBucketMessage((Player) sender);
                            }
                            return true;
                        }

                    if (args.length >=2 && args[1].equalsIgnoreCase("Axolotl")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getAxolotlPrice((Player) sender) + " &adollars from your account. &6/bucket axolotl confirm &ato continue"));
                        return true;
                    }

                    if (args.length >=2 && args[0].equalsIgnoreCase("Axolotl") && args[1].equalsIgnoreCase("confirm")) {

                        if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                            if (economy.getBalance(player) >= Methods.getAxolotlPrice((Player) sender)) {
                                sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with an Axolotl."));
                                economy.withdrawPlayer(player,Methods.getAxolotlPrice((Player) sender));
                                Methods.fillAxolotl(Objects.requireNonNull(((Player) sender).getPlayer()));
                                return true;

                            } else Methods.getNoMoneyMessage((Player) sender);

                            return true;

                        } else {
                            Methods.getNoBucketMessage((Player) sender);
                        }
                        return true;
                    }

                    if (args.length >=2 && args[1].equalsIgnoreCase("PowderedSnow")) {

                        sender.sendMessage(HexCode.format("&aThis will draw " + ChatColor.YELLOW + Methods.getPowderedSnowPrice((Player) sender) + " &adollars from your account. &6/bucket powderedsnow confirm &ato continue"));
                        return true;
                    }

                    if (args.length >=2 && args[0].equalsIgnoreCase("PowderedSnow") && args[1].equalsIgnoreCase("confirm")) {

                        if (player.getInventory().getItemInMainHand().getType().equals(Material.BUCKET)) {

                            if (economy.getBalance(player) >= Methods.getPowderedSnowPrice((Player) sender)) {
                                sender.sendMessage(HexCode.format("&aSuccessfully filled bucket with Powdered Snow."));
                                economy.withdrawPlayer(player,Methods.getPowderedSnowPrice((Player) sender));
                                Methods.fillPowderedSnow(Objects.requireNonNull(((Player) sender).getPlayer()));
                                return true;

                            } else Methods.getNoMoneyMessage((Player) sender);

                            return true;

                        } else {
                            Methods.getNoBucketMessage((Player) sender);
                        }
                        return true;
                    }
                }
                return true;
            } else {
                Methods.getNoPermissionMessage((Player) sender);
            }
        }
        return false;
    }
}
