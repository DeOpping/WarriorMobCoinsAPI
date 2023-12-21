# WarriorMobCoinsAPI
The API for WarriorMobCoins.
<br>

## Adding The API To Your Plugin
Latest Release:<br>
![Release](https://jitpack.io/v/DeOpping/WarriorMobCoinsAPI.svg)


build.gradle
```gradle
repositories {
    maven { url = 'https://jitpack.io' }
}

dependencies {
    compileOnly 'dev.paracausal:WarriorMobCoinsAPI:{version}'
}
```
pom.xml
```xml
<repositories>
    <repository>
        <id>jitpack</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>dev.paracausal</groupId>
        <artifactId>WarriorMobCoinsAPI</artifactId>
        <version>{version}</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
*Replace `{version}` with the latest release shown above!*
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
