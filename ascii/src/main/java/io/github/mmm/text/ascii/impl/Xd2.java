/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+D2xx (Hangul Syllables for Korean).
 */
final class Xd2 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("toels"), // 0x00
  new Letters("toelt"), // 0x01
  new Letters("toelp"), // 0x02
  new Letters("toelh"), // 0x03
  new Letters("toem"), // 0x04
  new Letters("toeb"), // 0x05
  new Letters("toebs"), // 0x06
  new Letters("toes"), // 0x07
  new Letters("toess"), // 0x08
  new Letters("toeng"), // 0x09
  new Letters("toej"), // 0x0a
  new Letters("toec"), // 0x0b
  new Letters("toek"), // 0x0c
  new Letters("toet"), // 0x0d
  new Letters("toep"), // 0x0e
  new Letters("toeh"), // 0x0f
  new Letters("tyo"), // 0x10
  new Letters("tyog"), // 0x11
  new Letters("tyogg"), // 0x12
  new Letters("tyogs"), // 0x13
  new Letters("tyon"), // 0x14
  new Letters("tyonj"), // 0x15
  new Letters("tyonh"), // 0x16
  new Letters("tyod"), // 0x17
  new Letters("tyol"), // 0x18
  new Letters("tyolg"), // 0x19
  new Letters("tyolm"), // 0x1a
  new Letters("tyolb"), // 0x1b
  new Letters("tyols"), // 0x1c
  new Letters("tyolt"), // 0x1d
  new Letters("tyolp"), // 0x1e
  new Letters("tyolh"), // 0x1f
  new Letters("tyom"), // 0x20
  new Letters("tyob"), // 0x21
  new Letters("tyobs"), // 0x22
  new Letters("tyos"), // 0x23
  new Letters("tyoss"), // 0x24
  new Letters("tyong"), // 0x25
  new Letters("tyoj"), // 0x26
  new Letters("tyoc"), // 0x27
  new Letters("tyok"), // 0x28
  new Letters("tyot"), // 0x29
  new Letters("tyop"), // 0x2a
  new Letters("tyoh"), // 0x2b
  LO_TU, // 0x2c
  new Letters("tug"), // 0x2d
  new Letters("tugg"), // 0x2e
  new Letters("tugs"), // 0x2f
  new Letters("tun"), // 0x30
  new Letters("tunj"), // 0x31
  new Letters("tunh"), // 0x32
  new Letters("tud"), // 0x33
  new Letters("tul"), // 0x34
  new Letters("tulg"), // 0x35
  new Letters("tulm"), // 0x36
  new Letters("tulb"), // 0x37
  new Letters("tuls"), // 0x38
  new Letters("tult"), // 0x39
  new Letters("tulp"), // 0x3a
  new Letters("tulh"), // 0x3b
  new Letters("tum"), // 0x3c
  new Letters("tub"), // 0x3d
  new Letters("tubs"), // 0x3e
  new Letters("tus"), // 0x3f
  new Letters("tuss"), // 0x40
  new Letters("tung"), // 0x41
  new Letters("tuj"), // 0x42
  new Letters("tuc"), // 0x43
  new Letters("tuk"), // 0x44
  new Letters("tut"), // 0x45
  new Letters("tup"), // 0x46
  new Letters("tuh"), // 0x47
  new Letters("tweo"), // 0x48
  new Letters("tweog"), // 0x49
  new Letters("tweogg"), // 0x4a
  new Letters("tweogs"), // 0x4b
  new Letters("tweon"), // 0x4c
  new Letters("tweonj"), // 0x4d
  new Letters("tweonh"), // 0x4e
  new Letters("tweod"), // 0x4f
  new Letters("tweol"), // 0x50
  new Letters("tweolg"), // 0x51
  new Letters("tweolm"), // 0x52
  new Letters("tweolb"), // 0x53
  new Letters("tweols"), // 0x54
  new Letters("tweolt"), // 0x55
  new Letters("tweolp"), // 0x56
  new Letters("tweolh"), // 0x57
  new Letters("tweom"), // 0x58
  new Letters("tweob"), // 0x59
  new Letters("tweobs"), // 0x5a
  new Letters("tweos"), // 0x5b
  new Letters("tweoss"), // 0x5c
  new Letters("tweong"), // 0x5d
  new Letters("tweoj"), // 0x5e
  new Letters("tweoc"), // 0x5f
  new Letters("tweok"), // 0x60
  new Letters("tweot"), // 0x61
  new Letters("tweop"), // 0x62
  new Letters("tweoh"), // 0x63
  new Letters("twe"), // 0x64
  new Letters("tweg"), // 0x65
  new Letters("twegg"), // 0x66
  new Letters("twegs"), // 0x67
  new Letters("twen"), // 0x68
  new Letters("twenj"), // 0x69
  new Letters("twenh"), // 0x6a
  new Letters("twed"), // 0x6b
  new Letters("twel"), // 0x6c
  new Letters("twelg"), // 0x6d
  new Letters("twelm"), // 0x6e
  new Letters("twelb"), // 0x6f
  new Letters("twels"), // 0x70
  new Letters("twelt"), // 0x71
  new Letters("twelp"), // 0x72
  new Letters("twelh"), // 0x73
  new Letters("twem"), // 0x74
  new Letters("tweb"), // 0x75
  new Letters("twebs"), // 0x76
  new Letters("twes"), // 0x77
  new Letters("twess"), // 0x78
  new Letters("tweng"), // 0x79
  new Letters("twej"), // 0x7a
  new Letters("twec"), // 0x7b
  new Letters("twek"), // 0x7c
  new Letters("twet"), // 0x7d
  new Letters("twep"), // 0x7e
  new Letters("tweh"), // 0x7f
  new Letters("twi"), // 0x80
  new Letters("twig"), // 0x81
  new Letters("twigg"), // 0x82
  new Letters("twigs"), // 0x83
  new Letters("twin"), // 0x84
  new Letters("twinj"), // 0x85
  new Letters("twinh"), // 0x86
  new Letters("twid"), // 0x87
  new Letters("twil"), // 0x88
  new Letters("twilg"), // 0x89
  new Letters("twilm"), // 0x8a
  new Letters("twilb"), // 0x8b
  new Letters("twils"), // 0x8c
  new Letters("twilt"), // 0x8d
  new Letters("twilp"), // 0x8e
  new Letters("twilh"), // 0x8f
  new Letters("twim"), // 0x90
  new Letters("twib"), // 0x91
  new Letters("twibs"), // 0x92
  new Letters("twis"), // 0x93
  new Letters("twiss"), // 0x94
  new Letters("twing"), // 0x95
  new Letters("twij"), // 0x96
  new Letters("twic"), // 0x97
  new Letters("twik"), // 0x98
  new Letters("twit"), // 0x99
  new Letters("twip"), // 0x9a
  new Letters("twih"), // 0x9b
  new Letters("tyu"), // 0x9c
  new Letters("tyug"), // 0x9d
  new Letters("tyugg"), // 0x9e
  new Letters("tyugs"), // 0x9f
  new Letters("tyun"), // 0xa0
  new Letters("tyunj"), // 0xa1
  new Letters("tyunh"), // 0xa2
  new Letters("tyud"), // 0xa3
  new Letters("tyul"), // 0xa4
  new Letters("tyulg"), // 0xa5
  new Letters("tyulm"), // 0xa6
  new Letters("tyulb"), // 0xa7
  new Letters("tyuls"), // 0xa8
  new Letters("tyult"), // 0xa9
  new Letters("tyulp"), // 0xaa
  new Letters("tyulh"), // 0xab
  new Letters("tyum"), // 0xac
  new Letters("tyub"), // 0xad
  new Letters("tyubs"), // 0xae
  new Letters("tyus"), // 0xaf
  new Letters("tyuss"), // 0xb0
  new Letters("tyung"), // 0xb1
  new Letters("tyuj"), // 0xb2
  new Letters("tyuc"), // 0xb3
  new Letters("tyuk"), // 0xb4
  new Letters("tyut"), // 0xb5
  new Letters("tyup"), // 0xb6
  new Letters("tyuh"), // 0xb7
  new Letters("teu"), // 0xb8
  new Letters("teug"), // 0xb9
  new Letters("teugg"), // 0xba
  new Letters("teugs"), // 0xbb
  new Letters("teun"), // 0xbc
  new Letters("teunj"), // 0xbd
  new Letters("teunh"), // 0xbe
  new Letters("teud"), // 0xbf
  new Letters("teul"), // 0xc0
  new Letters("teulg"), // 0xc1
  new Letters("teulm"), // 0xc2
  new Letters("teulb"), // 0xc3
  new Letters("teuls"), // 0xc4
  new Letters("teult"), // 0xc5
  new Letters("teulp"), // 0xc6
  new Letters("teulh"), // 0xc7
  new Letters("teum"), // 0xc8
  new Letters("teub"), // 0xc9
  new Letters("teubs"), // 0xca
  new Letters("teus"), // 0xcb
  new Letters("teuss"), // 0xcc
  new Letters("teung"), // 0xcd
  new Letters("teuj"), // 0xce
  new Letters("teuc"), // 0xcf
  new Letters("teuk"), // 0xd0
  new Letters("teut"), // 0xd1
  new Letters("teup"), // 0xd2
  new Letters("teuh"), // 0xd3
  new Letters("tyi"), // 0xd4
  new Letters("tyig"), // 0xd5
  new Letters("tyigg"), // 0xd6
  new Letters("tyigs"), // 0xd7
  new Letters("tyin"), // 0xd8
  new Letters("tyinj"), // 0xd9
  new Letters("tyinh"), // 0xda
  new Letters("tyid"), // 0xdb
  new Letters("tyil"), // 0xdc
  new Letters("tyilg"), // 0xdd
  new Letters("tyilm"), // 0xde
  new Letters("tyilb"), // 0xdf
  new Letters("tyils"), // 0xe0
  new Letters("tyilt"), // 0xe1
  new Letters("tyilp"), // 0xe2
  new Letters("tyilh"), // 0xe3
  new Letters("tyim"), // 0xe4
  new Letters("tyib"), // 0xe5
  new Letters("tyibs"), // 0xe6
  new Letters("tyis"), // 0xe7
  new Letters("tyiss"), // 0xe8
  new Letters("tying"), // 0xe9
  new Letters("tyij"), // 0xea
  new Letters("tyic"), // 0xeb
  new Letters("tyik"), // 0xec
  new Letters("tyit"), // 0xed
  new Letters("tyip"), // 0xee
  new Letters("tyih"), // 0xef
  LO_TI, // 0xf0
  new Letters("tig"), // 0xf1
  new Letters("tigg"), // 0xf2
  new Letters("tigs"), // 0xf3
  new Letters("tin"), // 0xf4
  new Letters("tinj"), // 0xf5
  new Letters("tinh"), // 0xf6
  new Letters("tid"), // 0xf7
  new Letters("til"), // 0xf8
  new Letters("tilg"), // 0xf9
  new Letters("tilm"), // 0xfa
  new Letters("tilb"), // 0xfb
  new Letters("tils"), // 0xfc
  new Letters("tilt"), // 0xfd
  new Letters("tilp"), // 0xfe
  new Letters("tilh") // 0xff
  };
}