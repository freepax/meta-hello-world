#
# Simple "Hello World" program used when learing yocto.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9dac6785a3c334e42556037c8b864b7f"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "74d5abca60e3107e0b01dd6b11e2b6295259bf26"
SRC_URI = "git://github.com/freepax/yocto-hello-world.git"

S = "${WORKDIR}/git"

inherit cmake
