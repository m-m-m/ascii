/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+51xx (CJK Unified Ideographs).
 */
final class X51 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Yi"), // 0x00
  new Word("Jun"), // 0x01
  new Word("Nong"), // 0x02
  new Word("Chan"), // 0x03
  new Word("Yi"), // 0x04
  new Word("Dang"), // 0x05
  new Word("Jing"), // 0x06
  new Word("Xuan"), // 0x07
  new Word("Kuai"), // 0x08
  new Word("Jian"), // 0x09
  new Word("Chu"), // 0x0a
  new Word("Dan"), // 0x0b
  new Word("Jiao"), // 0x0c
  new Word("Sha"), // 0x0d
  new Word("Zai"), // 0x0e
  null, // 0x0f
  new Word("Bin"), // 0x10
  new Word("An"), // 0x11
  new Word("Ru"), // 0x12
  new Word("Tai"), // 0x13
  new Word("Chou"), // 0x14
  new Word("Chai"), // 0x15
  new Word("Lan"), // 0x16
  new Word("Ni"), // 0x17
  new Word("Jin"), // 0x18
  new Word("Qian"), // 0x19
  new Word("Meng"), // 0x1a
  new Word("Wu"), // 0x1b
  new Word("Ning"), // 0x1c
  new Word("Qiong"), // 0x1d
  new Word("Ni"), // 0x1e
  new Word("Chang"), // 0x1f
  new Word("Lie"), // 0x20
  new Word("Lei"), // 0x21
  new Word("Lu"), // 0x22
  new Word("Kuang"), // 0x23
  new Word("Bao"), // 0x24
  new Word("Du"), // 0x25
  new Word("Biao"), // 0x26
  new Word("Zan"), // 0x27
  new Word("Zhi"), // 0x28
  new Word("Si"), // 0x29
  new Word("You"), // 0x2a
  new Word("Hao"), // 0x2b
  new Word("Chen"), // 0x2c
  new Word("Chen"), // 0x2d
  new Word("Li"), // 0x2e
  new Word("Teng"), // 0x2f
  new Word("Wei"), // 0x30
  new Word("Long"), // 0x31
  new Word("Chu"), // 0x32
  new Word("Chan"), // 0x33
  new Word("Rang"), // 0x34
  new Word("Shu"), // 0x35
  new Word("Hui"), // 0x36
  new Word("Li"), // 0x37
  new Word("Luo"), // 0x38
  new Word("Zan"), // 0x39
  new Word("Nuo"), // 0x3a
  new Word("Tang"), // 0x3b
  new Word("Yan"), // 0x3c
  new Word("Lei"), // 0x3d
  new Word("Nang"), // 0x3e
  new Word("Er"), // 0x3f
  new Word("Wu"), // 0x40
  new Word("Yun"), // 0x41
  new Word("Zan"), // 0x42
  new Word("Yuan"), // 0x43
  new Word("Xiong"), // 0x44
  new Word("Chong"), // 0x45
  new Word("Zhao"), // 0x46
  new Word("Xiong"), // 0x47
  new Word("Xian"), // 0x48
  new Word("Guang"), // 0x49
  new Word("Dui"), // 0x4a
  new Word("Ke"), // 0x4b
  new Word("Dui"), // 0x4c
  new Word("Mian"), // 0x4d
  new Word("Tu"), // 0x4e
  new Word("Chang"), // 0x4f
  new Word("Er"), // 0x50
  new Word("Dui"), // 0x51
  new Word("Er"), // 0x52
  new Word("Xin"), // 0x53
  new Word("Tu"), // 0x54
  new Word("Si"), // 0x55
  new Word("Yan"), // 0x56
  new Word("Yan"), // 0x57
  new Word("Shi"), // 0x58
  new Word("Shi"), // 0x59
  new Word("Dang"), // 0x5a
  new Word("Qian"), // 0x5b
  new Word("Dou"), // 0x5c
  new Word("Fen"), // 0x5d
  new Word("Mao"), // 0x5e
  new Word("Shen"), // 0x5f
  new Word("Dou"), // 0x60
  new Word("Bai"), // 0x61
  new Word("Jing"), // 0x62
  new Word("Li"), // 0x63
  new Word("Huang"), // 0x64
  new Word("Ru"), // 0x65
  new Word("Wang"), // 0x66
  new Word("Nei"), // 0x67
  new Word("Quan"), // 0x68
  new Word("Liang"), // 0x69
  new Word("Yu"), // 0x6a
  new Word("Ba"), // 0x6b
  new Word("Gong"), // 0x6c
  new Word("Liu"), // 0x6d
  new Word("Xi"), // 0x6e
  null, // 0x6f
  new Word("Lan"), // 0x70
  new Word("Gong"), // 0x71
  new Word("Tian"), // 0x72
  new Word("Guan"), // 0x73
  new Word("Xing"), // 0x74
  new Word("Bing"), // 0x75
  new Word("Qi"), // 0x76
  new Word("Ju"), // 0x77
  new Word("Dian"), // 0x78
  new Word("Zi"), // 0x79
  new Word("Ppwun"), // 0x7a
  new Word("Yang"), // 0x7b
  new Word("Jian"), // 0x7c
  new Word("Shou"), // 0x7d
  new Word("Ji"), // 0x7e
  new Word("Yi"), // 0x7f
  new Word("Ji"), // 0x80
  new Word("Chan"), // 0x81
  new Word("Jiong"), // 0x82
  new Word("Mao"), // 0x83
  new Word("Ran"), // 0x84
  new Word("Nei"), // 0x85
  new Word("Yuan"), // 0x86
  new Word("Mao"), // 0x87
  new Word("Gang"), // 0x88
  new Word("Ran"), // 0x89
  new Word("Ce"), // 0x8a
  new Word("Jiong"), // 0x8b
  new Word("Ce"), // 0x8c
  new Word("Zai"), // 0x8d
  new Word("Gua"), // 0x8e
  new Word("Jiong"), // 0x8f
  new Word("Mao"), // 0x90
  new Word("Zhou"), // 0x91
  new Word("Mou"), // 0x92
  new Word("Gou"), // 0x93
  new Word("Xu"), // 0x94
  new Word("Mian"), // 0x95
  new Word("Mi"), // 0x96
  new Word("Rong"), // 0x97
  new Word("Yin"), // 0x98
  new Word("Xie"), // 0x99
  new Word("Kan"), // 0x9a
  new Word("Jun"), // 0x9b
  new Word("Nong"), // 0x9c
  new Word("Yi"), // 0x9d
  new Word("Mi"), // 0x9e
  new Word("Shi"), // 0x9f
  new Word("Guan"), // 0xa0
  new Word("Meng"), // 0xa1
  new Word("Zhong"), // 0xa2
  new Word("Ju"), // 0xa3
  new Word("Yuan"), // 0xa4
  new Word("Ming"), // 0xa5
  new Word("Kou"), // 0xa6
  new Word("Lam"), // 0xa7
  new Word("Fu"), // 0xa8
  new Word("Xie"), // 0xa9
  new Word("Mi"), // 0xaa
  new Word("Bing"), // 0xab
  new Word("Dong"), // 0xac
  new Word("Tai"), // 0xad
  new Word("Gang"), // 0xae
  new Word("Feng"), // 0xaf
  new Word("Bing"), // 0xb0
  new Word("Hu"), // 0xb1
  new Word("Chong"), // 0xb2
  new Word("Jue"), // 0xb3
  new Word("Hu"), // 0xb4
  new Word("Kuang"), // 0xb5
  new Word("Ye"), // 0xb6
  new Word("Leng"), // 0xb7
  new Word("Pan"), // 0xb8
  new Word("Fu"), // 0xb9
  new Word("Min"), // 0xba
  new Word("Dong"), // 0xbb
  new Word("Xian"), // 0xbc
  new Word("Lie"), // 0xbd
  new Word("Xia"), // 0xbe
  new Word("Jian"), // 0xbf
  new Word("Jing"), // 0xc0
  new Word("Shu"), // 0xc1
  new Word("Mei"), // 0xc2
  new Word("Tu"), // 0xc3
  new Word("Qi"), // 0xc4
  new Word("Gu"), // 0xc5
  new Word("Zhun"), // 0xc6
  new Word("Song"), // 0xc7
  new Word("Jing"), // 0xc8
  new Word("Liang"), // 0xc9
  new Word("Qing"), // 0xca
  new Word("Diao"), // 0xcb
  new Word("Ling"), // 0xcc
  new Word("Dong"), // 0xcd
  new Word("Gan"), // 0xce
  new Word("Jian"), // 0xcf
  new Word("Yin"), // 0xd0
  new Word("Cou"), // 0xd1
  new Word("Yi"), // 0xd2
  new Word("Li"), // 0xd3
  new Word("Cang"), // 0xd4
  new Word("Ming"), // 0xd5
  new Word("Zhuen"), // 0xd6
  new Word("Cui"), // 0xd7
  new Word("Si"), // 0xd8
  new Word("Duo"), // 0xd9
  new Word("Jin"), // 0xda
  new Word("Lin"), // 0xdb
  new Word("Lin"), // 0xdc
  new Word("Ning"), // 0xdd
  new Word("Xi"), // 0xde
  new Word("Du"), // 0xdf
  new Word("Ji"), // 0xe0
  new Word("Fan"), // 0xe1
  new Word("Fan"), // 0xe2
  new Word("Fan"), // 0xe3
  new Word("Feng"), // 0xe4
  new Word("Ju"), // 0xe5
  new Word("Chu"), // 0xe6
  new Word("Tako"), // 0xe7
  new Word("Feng"), // 0xe8
  new Word("Mok"), // 0xe9
  new Word("Ci"), // 0xea
  new Word("Fu"), // 0xeb
  new Word("Feng"), // 0xec
  new Word("Ping"), // 0xed
  new Word("Feng"), // 0xee
  new Word("Kai"), // 0xef
  new Word("Huang"), // 0xf0
  new Word("Kai"), // 0xf1
  new Word("Gan"), // 0xf2
  new Word("Deng"), // 0xf3
  new Word("Ping"), // 0xf4
  new Word("Qu"), // 0xf5
  new Word("Xiong"), // 0xf6
  new Word("Kuai"), // 0xf7
  new Word("Tu"), // 0xf8
  new Word("Ao"), // 0xf9
  new Word("Chu"), // 0xfa
  new Word("Ji"), // 0xfb
  new Word("Dang"), // 0xfc
  new Word("Han"), // 0xfd
  new Word("Han"), // 0xfe
  new Word("Zao") // 0xff
  };
}