/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+9Bxx (CJK Unified Ideographs).
 */
final class X9b extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Ti"), // 0x00
  new Word("Li"), // 0x01
  new Word("Bin"), // 0x02
  new Word("Zong"), // 0x03
  new Word("Ti"), // 0x04
  new Word("Peng"), // 0x05
  new Word("Song"), // 0x06
  new Word("Zheng"), // 0x07
  new Word("Quan"), // 0x08
  new Word("Zong"), // 0x09
  new Word("Shun"), // 0x0a
  new Word("Jian"), // 0x0b
  new Word("Duo"), // 0x0c
  new Word("Hu"), // 0x0d
  new Word("La"), // 0x0e
  new Word("Jiu"), // 0x0f
  new Word("Qi"), // 0x10
  new Word("Lian"), // 0x11
  new Word("Zhen"), // 0x12
  new Word("Bin"), // 0x13
  new Word("Peng"), // 0x14
  new Word("Mo"), // 0x15
  new Word("San"), // 0x16
  new Word("Man"), // 0x17
  new Word("Man"), // 0x18
  new Word("Seng"), // 0x19
  new Word("Xu"), // 0x1a
  new Word("Lie"), // 0x1b
  new Word("Qian"), // 0x1c
  new Word("Qian"), // 0x1d
  new Word("Nong"), // 0x1e
  new Word("Huan"), // 0x1f
  new Word("Kuai"), // 0x20
  new Word("Ning"), // 0x21
  new Word("Bin"), // 0x22
  new Word("Lie"), // 0x23
  new Word("Rang"), // 0x24
  new Word("Dou"), // 0x25
  new Word("Dou"), // 0x26
  new Word("Nao"), // 0x27
  new Word("Hong"), // 0x28
  new Word("Xi"), // 0x29
  new Word("Dou"), // 0x2a
  new Word("Han"), // 0x2b
  new Word("Dou"), // 0x2c
  new Word("Dou"), // 0x2d
  new Word("Jiu"), // 0x2e
  new Word("Chang"), // 0x2f
  new Word("Yu"), // 0x30
  new Word("Yu"), // 0x31
  new Word("Li"), // 0x32
  new Word("Juan"), // 0x33
  new Word("Fu"), // 0x34
  new Word("Qian"), // 0x35
  new Word("Gui"), // 0x36
  new Word("Zong"), // 0x37
  new Word("Liu"), // 0x38
  new Word("Gui"), // 0x39
  new Word("Shang"), // 0x3a
  new Word("Yu"), // 0x3b
  new Word("Gui"), // 0x3c
  new Word("Mei"), // 0x3d
  new Word("Ji"), // 0x3e
  new Word("Qi"), // 0x3f
  new Word("Jie"), // 0x40
  new Word("Kui"), // 0x41
  new Word("Hun"), // 0x42
  new Word("Ba"), // 0x43
  new Word("Po"), // 0x44
  new Word("Mei"), // 0x45
  new Word("Xu"), // 0x46
  new Word("Yan"), // 0x47
  new Word("Xiao"), // 0x48
  new Word("Liang"), // 0x49
  new Word("Yu"), // 0x4a
  new Word("Tui"), // 0x4b
  new Word("Qi"), // 0x4c
  new Word("Wang"), // 0x4d
  new Word("Liang"), // 0x4e
  new Word("Wei"), // 0x4f
  new Word("Jian"), // 0x50
  new Word("Chi"), // 0x51
  new Word("Piao"), // 0x52
  new Word("Bi"), // 0x53
  new Word("Mo"), // 0x54
  new Word("Ji"), // 0x55
  new Word("Xu"), // 0x56
  new Word("Chou"), // 0x57
  new Word("Yan"), // 0x58
  new Word("Zhan"), // 0x59
  new Word("Yu"), // 0x5a
  new Word("Dao"), // 0x5b
  new Word("Ren"), // 0x5c
  new Word("Ji"), // 0x5d
  new Word("Eri"), // 0x5e
  new Word("Gong"), // 0x5f
  new Word("Tuo"), // 0x60
  new Word("Diao"), // 0x61
  new Word("Ji"), // 0x62
  new Word("Xu"), // 0x63
  new Word("E"), // 0x64
  new Word("E"), // 0x65
  new Word("Sha"), // 0x66
  new Word("Hang"), // 0x67
  new Word("Tun"), // 0x68
  new Word("Mo"), // 0x69
  new Word("Jie"), // 0x6a
  new Word("Shen"), // 0x6b
  new Word("Fan"), // 0x6c
  new Word("Yuan"), // 0x6d
  new Word("Bi"), // 0x6e
  new Word("Lu"), // 0x6f
  new Word("Wen"), // 0x70
  new Word("Hu"), // 0x71
  new Word("Lu"), // 0x72
  new Word("Za"), // 0x73
  new Word("Fang"), // 0x74
  new Word("Fen"), // 0x75
  new Word("Na"), // 0x76
  new Word("You"), // 0x77
  new Word("Namazu"), // 0x78
  new Word("Todo"), // 0x79
  new Word("He"), // 0x7a
  new Word("Xia"), // 0x7b
  new Word("Qu"), // 0x7c
  new Word("Han"), // 0x7d
  new Word("Pi"), // 0x7e
  new Word("Ling"), // 0x7f
  new Word("Tuo"), // 0x80
  new Word("Bo"), // 0x81
  new Word("Qiu"), // 0x82
  new Word("Ping"), // 0x83
  new Word("Fu"), // 0x84
  new Word("Bi"), // 0x85
  new Word("Ji"), // 0x86
  new Word("Wei"), // 0x87
  new Word("Ju"), // 0x88
  new Word("Diao"), // 0x89
  new Word("Bo"), // 0x8a
  new Word("You"), // 0x8b
  new Word("Gun"), // 0x8c
  new Word("Pi"), // 0x8d
  new Word("Nian"), // 0x8e
  new Word("Xing"), // 0x8f
  new Word("Tai"), // 0x90
  new Word("Bao"), // 0x91
  new Word("Fu"), // 0x92
  new Word("Zha"), // 0x93
  new Word("Ju"), // 0x94
  new Word("Gu"), // 0x95
  new Word("Kajika"), // 0x96
  new Word("Tong"), // 0x97
  null, // 0x98
  new Word("Ta"), // 0x99
  new Word("Jie"), // 0x9a
  new Word("Shu"), // 0x9b
  new Word("Hou"), // 0x9c
  new Word("Xiang"), // 0x9d
  new Word("Er"), // 0x9e
  new Word("An"), // 0x9f
  new Word("Wei"), // 0xa0
  new Word("Tiao"), // 0xa1
  new Word("Zhu"), // 0xa2
  new Word("Yin"), // 0xa3
  new Word("Lie"), // 0xa4
  new Word("Luo"), // 0xa5
  new Word("Tong"), // 0xa6
  new Word("Yi"), // 0xa7
  new Word("Qi"), // 0xa8
  new Word("Bing"), // 0xa9
  new Word("Wei"), // 0xaa
  new Word("Jiao"), // 0xab
  new Word("Bu"), // 0xac
  new Word("Gui"), // 0xad
  new Word("Xian"), // 0xae
  new Word("Ge"), // 0xaf
  new Word("Hui"), // 0xb0
  new Word("Bora"), // 0xb1
  new Word("Mate"), // 0xb2
  new Word("Kao"), // 0xb3
  new Word("Gori"), // 0xb4
  new Word("Duo"), // 0xb5
  new Word("Jun"), // 0xb6
  new Word("Ti"), // 0xb7
  new Word("Man"), // 0xb8
  new Word("Xiao"), // 0xb9
  new Word("Za"), // 0xba
  new Word("Sha"), // 0xbb
  new Word("Qin"), // 0xbc
  new Word("Yu"), // 0xbd
  new Word("Nei"), // 0xbe
  new Word("Zhe"), // 0xbf
  new Word("Gun"), // 0xc0
  new Word("Geng"), // 0xc1
  new Word("Su"), // 0xc2
  new Word("Wu"), // 0xc3
  new Word("Qiu"), // 0xc4
  new Word("Ting"), // 0xc5
  new Word("Fu"), // 0xc6
  new Word("Wan"), // 0xc7
  new Word("You"), // 0xc8
  new Word("Li"), // 0xc9
  new Word("Sha"), // 0xca
  new Word("Sha"), // 0xcb
  new Word("Gao"), // 0xcc
  new Word("Meng"), // 0xcd
  new Word("Ugui"), // 0xce
  new Word("Asari"), // 0xcf
  new Word("Subashiri"), // 0xd0
  new Word("Kazunoko"), // 0xd1
  new Word("Yong"), // 0xd2
  new Word("Ni"), // 0xd3
  new Word("Zi"), // 0xd4
  new Word("Qi"), // 0xd5
  new Word("Qing"), // 0xd6
  new Word("Xiang"), // 0xd7
  new Word("Nei"), // 0xd8
  new Word("Chun"), // 0xd9
  new Word("Ji"), // 0xda
  new Word("Diao"), // 0xdb
  new Word("Qie"), // 0xdc
  new Word("Gu"), // 0xdd
  new Word("Zhou"), // 0xde
  new Word("Dong"), // 0xdf
  new Word("Lai"), // 0xe0
  new Word("Fei"), // 0xe1
  new Word("Ni"), // 0xe2
  new Word("Yi"), // 0xe3
  new Word("Kun"), // 0xe4
  new Word("Lu"), // 0xe5
  new Word("Jiu"), // 0xe6
  new Word("Chang"), // 0xe7
  new Word("Jing"), // 0xe8
  new Word("Lun"), // 0xe9
  new Word("Ling"), // 0xea
  new Word("Zou"), // 0xeb
  new Word("Li"), // 0xec
  new Word("Meng"), // 0xed
  new Word("Zong"), // 0xee
  new Word("Zhi"), // 0xef
  new Word("Nian"), // 0xf0
  new Word("Shachi"), // 0xf1
  new Word("Dojou"), // 0xf2
  new Word("Sukesou"), // 0xf3
  new Word("Shi"), // 0xf4
  new Word("Shen"), // 0xf5
  new Word("Hun"), // 0xf6
  new Word("Shi"), // 0xf7
  new Word("Hou"), // 0xf8
  new Word("Xing"), // 0xf9
  new Word("Zhu"), // 0xfa
  new Word("La"), // 0xfb
  new Word("Zong"), // 0xfc
  new Word("Ji"), // 0xfd
  new Word("Bian"), // 0xfe
  new Word("Bian") // 0xff
  };
}