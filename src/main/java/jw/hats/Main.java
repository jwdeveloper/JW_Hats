package jw.hats;

import jw.hats.data.Consts;
import jw.spigot_fluent_api.fluent_plugin.FluentPlugin;
import jw.spigot_fluent_api.fluent_plugin.config.ConfigFile;
import jw.spigot_fluent_api.fluent_plugin.starup_actions.api.PluginConfiguration;

public final class Main extends FluentPlugin {

    @Override
    protected void OnConfiguration(PluginConfiguration configuration, ConfigFile configFile) {

        configuration.configurePlugin(pluginOptions ->
        {
            pluginOptions.useDefaultNamespace("hats");
            pluginOptions.useMetrics(Consts.METHRIC_ID);
            pluginOptions.useUpdate(Consts.UPDATE_URL);
            pluginOptions.useResourcePack(Consts.RESOURCEPACK_URL);
        });
    }

    @Override
    protected void OnFluentPluginEnable() {

    }

    @Override
    protected void OnFluentPluginDisable() {

    }
}
