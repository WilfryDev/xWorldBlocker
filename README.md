## 🔥 Partner 10% discount on your purchases on [Website](https://cprot.net/)
![partner](https://cdn.modrinth.com/data/cached_images/b93aa3ea2ac405d138954f35aa09c4177dd7880b.jpeg)

![Banner](https://cdn.modrinth.com/data/cached_images/efa8f97856730d4545b0104943d46767208b4169.jpeg)
## xWorldBlocker | Total Control Over Your World Access!

Have you ever needed to restrict access to a specific world? Whether it's for a VIP zone, a temporary event world, or a staff-exclusive area, xWorldBlocker is your ultimate solution. This lightweight and powerful plugin allows you to block entry to any world on your server, granting access only to players with the proper permissions.

Forget complicated setups! With xWorldBlocker, you get total control in a simple and intuitive way.

🚀 Key Features
🛡️ Customizable World Blocking: Easily define a list of worlds that can only be accessed by permission.

🔑 Granular Permission System: Grant access to a specific world (xworldblocker.bypass.<worldname>) or to all locked worlds at once (xworldblocker.bypass.*).

💬 100% Configurable Messages: Edit all plugin messages to your liking. It supports HEX colors (&#RRGGBB) and standard Minecraft color codes (&a, &l) to perfectly match your server's aesthetic!

⚙️ Reload Command: Instantly apply configuration changes with the /xwb reload command without needing to restart the server.

🕊️ Lightweight & Optimized: Designed to run efficiently without impacting your server's performance.

## 🔧 Configuration
The setup is incredibly simple. Everything is managed from the config.yml file:

```yaml
#            __    __           _     _   ___ _            _
#    __  __/ / /\ \ \___  _ __| | __| | / __\ | ___   ___| | _____ _ __
#    \ \/ /\ \/  \/ / _ \| '__| |/ _` |/__\// |/ _ \ / __| |/ / _ \ '__|
#     >  <  \  /\  / (_) | |  | | (_| / \/  \ | (_) | (__|   <  __/ |
#    /_/\_\  \/  \/ \___/|_|  |_|\__,_\_____/_|\___/ \___|_|\_\___|_|
#                     xPlugins - WillfryDev - 777 Studios

# Lista de mundos que quieres bloquear.
# Para entrar a estos mundos, el jugador necesitará el permiso: xworldblocker.bypass.<nombredelmundo>
# Por ejemplo, para entrar a 'eventos', necesitará 'xworldblocker.bypass.eventos'.
# Si un jugador tiene 'xworldblocker.bypass.*', podrá entrar a todos los mundos.
blocked-worlds:
  - "eventos"
  - "staff_zone"
  - "mundo_vip"

# Mensajes del plugin. Puedes usar colores HEX (&#RRGGBB) y códigos de color de Minecraft (&a, &l, etc.).
# Si dejas un mensaje en blanco (''), no se enviará nada.
messages:
  reload: "&#A2E4B8 ✔ ¡Listo! &#C1FFD7La configuración de xWorldBlocker ha sido recargada."
  no-permission-entry: "&#FFB6C1 ✘ ¡Error! &#FFDDC1No tienes permisos para entrar a este mundo."
  no-permission-command: "&#FFB6C1 ✘ ¡Error! &#FFDDC1No tienes permisos para usar este comando."
  help:
    - ""
    - "&#A2E4B8/xwb reload &#87CEEB- Recarga la configuración del plugin."
    - "&#A2E4B8/xwb help &#87CEEB- Muestra este mensaje de ayuda."
    - ""

#         ____
#  __  _|  _ \
#  \ \/ / |_) |
#   >  <|  __/
#  /_/\_\_|lugins
#           Org.
```

## 🎮 Commands
/xworldblocker help or /xwb help: Displays the list of available commands.

/xworldblocker reload or /xwb reload: Reloads the plugin configuration from the config.yml file.

## 🔐 Permissions
xworldblocker.admin

Description: Allows the player to use the /xwb reload command.
Default: OP

xworldblocker.bypass.<worldname>
Description: Allows the player to enter a specific locked world. Replace <worldname> with the exact name of the world (e.g., xworldblocker.bypass.vip_world).

## 🔥 Partner 10% discount on your purchases on [Website](https://cprot.net/)
![partner](https://cdn.modrinth.com/data/cached_images/b93aa3ea2ac405d138954f35aa09c4177dd7880b.jpeg)
