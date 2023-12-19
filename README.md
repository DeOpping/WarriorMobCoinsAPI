# WarriorMobCoinsAPI
The API for WarriorMobCoins.
<br>

## Adding The API To Your Plugin
Latest Release:<br>
![Release](https://jitpack.io/v/DeOpping/WarriorMobCoinsAPI.svg)


In your build.gradle file

```gradle
repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    compileOnly 'dev.paracausal:WarriorMobCoinsAPI:{release}'
}
```
*Replace `{release}` with the latest release shown above!*
<br><br>

Add WarriorMobCoins as a dependency in your plugin.yml:
```yml
dependencies: ["WarriorMobCoins"]
```
<br>

## Using The API In Your Plugin
```java
MobCoinsAPI api = (MobCoinsAPI) Bukkit.getPluginManager().getPlugin("WarriorMobCoins");
CoinManager coinManager = api.coinManager();
ActionManager actionManager = api.actionManager();
```
View our [wiki](../../wiki) for more information about the API!
