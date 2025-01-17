/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+ADxx (Hangul Syllables for Korean).
 */
final class Xad extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Letters("gwan"), // 0x00
  new Letters("gwanj"), // 0x01
  new Letters("gwanh"), // 0x02
  new Letters("gwad"), // 0x03
  new Letters("gwal"), // 0x04
  new Letters("gwalg"), // 0x05
  new Letters("gwalm"), // 0x06
  new Letters("gwalb"), // 0x07
  new Letters("gwals"), // 0x08
  new Letters("gwalt"), // 0x09
  new Letters("gwalp"), // 0x0a
  new Letters("gwalh"), // 0x0b
  new Letters("gwam"), // 0x0c
  new Letters("gwab"), // 0x0d
  new Letters("gwabs"), // 0x0e
  new Letters("gwas"), // 0x0f
  new Letters("gwass"), // 0x10
  new Letters("gwang"), // 0x11
  new Letters("gwaj"), // 0x12
  new Letters("gwac"), // 0x13
  new Letters("gwak"), // 0x14
  new Letters("gwat"), // 0x15
  new Letters("gwap"), // 0x16
  new Letters("gwah"), // 0x17
  new Letters("gwae"), // 0x18
  new Letters("gwaeg"), // 0x19
  new Letters("gwaegg"), // 0x1a
  new Letters("gwaegs"), // 0x1b
  new Letters("gwaen"), // 0x1c
  new Letters("gwaenj"), // 0x1d
  new Letters("gwaenh"), // 0x1e
  new Letters("gwaed"), // 0x1f
  new Letters("gwael"), // 0x20
  new Letters("gwaelg"), // 0x21
  new Letters("gwaelm"), // 0x22
  new Letters("gwaelb"), // 0x23
  new Letters("gwaels"), // 0x24
  new Letters("gwaelt"), // 0x25
  new Letters("gwaelp"), // 0x26
  new Letters("gwaelh"), // 0x27
  new Letters("gwaem"), // 0x28
  new Letters("gwaeb"), // 0x29
  new Letters("gwaebs"), // 0x2a
  new Letters("gwaes"), // 0x2b
  new Letters("gwaess"), // 0x2c
  new Letters("gwaeng"), // 0x2d
  new Letters("gwaej"), // 0x2e
  new Letters("gwaec"), // 0x2f
  new Letters("gwaek"), // 0x30
  new Letters("gwaet"), // 0x31
  new Letters("gwaep"), // 0x32
  new Letters("gwaeh"), // 0x33
  new Letters("goe"), // 0x34
  new Letters("goeg"), // 0x35
  new Letters("goegg"), // 0x36
  new Letters("goegs"), // 0x37
  new Letters("goen"), // 0x38
  new Letters("goenj"), // 0x39
  new Letters("goenh"), // 0x3a
  new Letters("goed"), // 0x3b
  new Letters("goel"), // 0x3c
  new Letters("goelg"), // 0x3d
  new Letters("goelm"), // 0x3e
  new Letters("goelb"), // 0x3f
  new Letters("goels"), // 0x40
  new Letters("goelt"), // 0x41
  new Letters("goelp"), // 0x42
  new Letters("goelh"), // 0x43
  new Letters("goem"), // 0x44
  new Letters("goeb"), // 0x45
  new Letters("goebs"), // 0x46
  new Letters("goes"), // 0x47
  new Letters("goess"), // 0x48
  new Letters("goeng"), // 0x49
  new Letters("goej"), // 0x4a
  new Letters("goec"), // 0x4b
  new Letters("goek"), // 0x4c
  new Letters("goet"), // 0x4d
  new Letters("goep"), // 0x4e
  new Letters("goeh"), // 0x4f
  new Letters("gyo"), // 0x50
  new Letters("gyog"), // 0x51
  new Letters("gyogg"), // 0x52
  new Letters("gyogs"), // 0x53
  new Letters("gyon"), // 0x54
  new Letters("gyonj"), // 0x55
  new Letters("gyonh"), // 0x56
  new Letters("gyod"), // 0x57
  new Letters("gyol"), // 0x58
  new Letters("gyolg"), // 0x59
  new Letters("gyolm"), // 0x5a
  new Letters("gyolb"), // 0x5b
  new Letters("gyols"), // 0x5c
  new Letters("gyolt"), // 0x5d
  new Letters("gyolp"), // 0x5e
  new Letters("gyolh"), // 0x5f
  new Letters("gyom"), // 0x60
  new Letters("gyob"), // 0x61
  new Letters("gyobs"), // 0x62
  new Letters("gyos"), // 0x63
  new Letters("gyoss"), // 0x64
  new Letters("gyong"), // 0x65
  new Letters("gyoj"), // 0x66
  new Letters("gyoc"), // 0x67
  new Letters("gyok"), // 0x68
  new Letters("gyot"), // 0x69
  new Letters("gyop"), // 0x6a
  new Letters("gyoh"), // 0x6b
  LO_GU, // 0x6c
  new Letters("gug"), // 0x6d
  new Letters("gugg"), // 0x6e
  new Letters("gugs"), // 0x6f
  new Letters("gun"), // 0x70
  new Letters("gunj"), // 0x71
  new Letters("gunh"), // 0x72
  new Letters("gud"), // 0x73
  new Letters("gul"), // 0x74
  new Letters("gulg"), // 0x75
  new Letters("gulm"), // 0x76
  new Letters("gulb"), // 0x77
  new Letters("guls"), // 0x78
  new Letters("gult"), // 0x79
  new Letters("gulp"), // 0x7a
  new Letters("gulh"), // 0x7b
  new Letters("gum"), // 0x7c
  new Letters("gub"), // 0x7d
  new Letters("gubs"), // 0x7e
  new Letters("gus"), // 0x7f
  new Letters("guss"), // 0x80
  new Letters("gung"), // 0x81
  new Letters("guj"), // 0x82
  new Letters("guc"), // 0x83
  new Letters("guk"), // 0x84
  new Letters("gut"), // 0x85
  new Letters("gup"), // 0x86
  new Letters("guh"), // 0x87
  new Letters("gweo"), // 0x88
  new Letters("gweog"), // 0x89
  new Letters("gweogg"), // 0x8a
  new Letters("gweogs"), // 0x8b
  new Letters("gweon"), // 0x8c
  new Letters("gweonj"), // 0x8d
  new Letters("gweonh"), // 0x8e
  new Letters("gweod"), // 0x8f
  new Letters("gweol"), // 0x90
  new Letters("gweolg"), // 0x91
  new Letters("gweolm"), // 0x92
  new Letters("gweolb"), // 0x93
  new Letters("gweols"), // 0x94
  new Letters("gweolt"), // 0x95
  new Letters("gweolp"), // 0x96
  new Letters("gweolh"), // 0x97
  new Letters("gweom"), // 0x98
  new Letters("gweob"), // 0x99
  new Letters("gweobs"), // 0x9a
  new Letters("gweos"), // 0x9b
  new Letters("gweoss"), // 0x9c
  new Letters("gweong"), // 0x9d
  new Letters("gweoj"), // 0x9e
  new Letters("gweoc"), // 0x9f
  new Letters("gweok"), // 0xa0
  new Letters("gweot"), // 0xa1
  new Letters("gweop"), // 0xa2
  new Letters("gweoh"), // 0xa3
  new Letters("gwe"), // 0xa4
  new Letters("gweg"), // 0xa5
  new Letters("gwegg"), // 0xa6
  new Letters("gwegs"), // 0xa7
  new Letters("gwen"), // 0xa8
  new Letters("gwenj"), // 0xa9
  new Letters("gwenh"), // 0xaa
  new Letters("gwed"), // 0xab
  new Letters("gwel"), // 0xac
  new Letters("gwelg"), // 0xad
  new Letters("gwelm"), // 0xae
  new Letters("gwelb"), // 0xaf
  new Letters("gwels"), // 0xb0
  new Letters("gwelt"), // 0xb1
  new Letters("gwelp"), // 0xb2
  new Letters("gwelh"), // 0xb3
  new Letters("gwem"), // 0xb4
  new Letters("gweb"), // 0xb5
  new Letters("gwebs"), // 0xb6
  new Letters("gwes"), // 0xb7
  new Letters("gwess"), // 0xb8
  new Letters("gweng"), // 0xb9
  new Letters("gwej"), // 0xba
  new Letters("gwec"), // 0xbb
  new Letters("gwek"), // 0xbc
  new Letters("gwet"), // 0xbd
  new Letters("gwep"), // 0xbe
  new Letters("gweh"), // 0xbf
  new Letters("gwi"), // 0xc0
  new Letters("gwig"), // 0xc1
  new Letters("gwigg"), // 0xc2
  new Letters("gwigs"), // 0xc3
  new Letters("gwin"), // 0xc4
  new Letters("gwinj"), // 0xc5
  new Letters("gwinh"), // 0xc6
  new Letters("gwid"), // 0xc7
  new Letters("gwil"), // 0xc8
  new Letters("gwilg"), // 0xc9
  new Letters("gwilm"), // 0xca
  new Letters("gwilb"), // 0xcb
  new Letters("gwils"), // 0xcc
  new Letters("gwilt"), // 0xcd
  new Letters("gwilp"), // 0xce
  new Letters("gwilh"), // 0xcf
  new Letters("gwim"), // 0xd0
  new Letters("gwib"), // 0xd1
  new Letters("gwibs"), // 0xd2
  new Letters("gwis"), // 0xd3
  new Letters("gwiss"), // 0xd4
  new Letters("gwing"), // 0xd5
  new Letters("gwij"), // 0xd6
  new Letters("gwic"), // 0xd7
  new Letters("gwik"), // 0xd8
  new Letters("gwit"), // 0xd9
  new Letters("gwip"), // 0xda
  new Letters("gwih"), // 0xdb
  new Letters("gyu"), // 0xdc
  new Letters("gyug"), // 0xdd
  new Letters("gyugg"), // 0xde
  new Letters("gyugs"), // 0xdf
  new Letters("gyun"), // 0xe0
  new Letters("gyunj"), // 0xe1
  new Letters("gyunh"), // 0xe2
  new Letters("gyud"), // 0xe3
  new Letters("gyul"), // 0xe4
  new Letters("gyulg"), // 0xe5
  new Letters("gyulm"), // 0xe6
  new Letters("gyulb"), // 0xe7
  new Letters("gyuls"), // 0xe8
  new Letters("gyult"), // 0xe9
  new Letters("gyulp"), // 0xea
  new Letters("gyulh"), // 0xeb
  new Letters("gyum"), // 0xec
  new Letters("gyub"), // 0xed
  new Letters("gyubs"), // 0xee
  new Letters("gyus"), // 0xef
  new Letters("gyuss"), // 0xf0
  new Letters("gyung"), // 0xf1
  new Letters("gyuj"), // 0xf2
  new Letters("gyuc"), // 0xf3
  new Letters("gyuk"), // 0xf4
  new Letters("gyut"), // 0xf5
  new Letters("gyup"), // 0xf6
  new Letters("gyuh"), // 0xf7
  new Letters("geu"), // 0xf8
  new Letters("geug"), // 0xf9
  new Letters("geugg"), // 0xfa
  new Letters("geugs"), // 0xfb
  new Letters("geun"), // 0xfc
  new Letters("geunj"), // 0xfd
  new Letters("geunh"), // 0xfe
  new Letters("geud") // 0xff
  };
}