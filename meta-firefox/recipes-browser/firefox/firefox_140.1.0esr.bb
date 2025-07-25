# Copyright (C) 2009-2015, O.S. Systems Software Ltda. All Rights Reserved
# Released under the MIT license (see packages/COPYING)

include firefox_crates_esr.inc
include firefox.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/firefox-esr:"

SRC_URI += "git://github.com/chris-zen/coremidi.git;protocol=https;branch=master;name=coremidi;destsuffix=coremidi \
            git://github.com/gfx-rs/wgpu.git;protocol=https;nobranch=1;name=wgpu;destsuffix=wgpu"

SRC_URI[sha256sum] = "d15c65d790e0c371b5c95332141b1bdeb29fefc27f852d22a5f542b6d1bc1922"

SRCREV_FORMAT .= "_application-services"
SRCREV_application-services = "9b46be5beedb6a1d859014a71bac58e2d722f954"

SRCREV_FORMAT .= "_coremidi"
SRCREV_coremidi = "fc68464b5445caf111e41f643a2e69ccce0b4f83"

SRCREV_FORMAT .= "_mp4parse"
SRCREV_mp4parse = "e64650a686e5c5732395cd059e17cfd3b1e5b63b"

SRCREV_FORMAT .= "_midir"
SRCREV_midir = "85156e360a37d851734118104619f86bd18e94c6"

SRCREV_FORMAT .= "_wgpu"
SRCREV_wgpu = "88862f1fa3fd0f0c1010e9fc999dcfe47b5ae8fc"

SRCREV_FORMAT .= "_midir"
SRCREV_midir = "85156e360a37d851734118104619f86bd18e94c6"
