DESCRIPTION = "Image project"

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    systemd \
    nano \
    openssh \
"

inherit core-image
