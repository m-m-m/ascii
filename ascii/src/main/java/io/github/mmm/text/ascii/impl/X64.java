/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+64xx (CJK Unified Ideographs).
 */
final class X64 extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("Chan"), // 0x00
  new Word("Ge"), // 0x01
  new Word("Lou"), // 0x02
  new Word("Zong"), // 0x03
  new Word("Geng"), // 0x04
  new Word("Jiao"), // 0x05
  new Word("Gou"), // 0x06
  new Word("Qin"), // 0x07
  new Word("Yong"), // 0x08
  new Word("Que"), // 0x09
  new Word("Chou"), // 0x0a
  new Word("Chi"), // 0x0b
  new Word("Zhan"), // 0x0c
  new Word("Sun"), // 0x0d
  new Word("Sun"), // 0x0e
  new Word("Bo"), // 0x0f
  new Word("Chu"), // 0x10
  new Word("Rong"), // 0x11
  new Word("Beng"), // 0x12
  new Word("Cuo"), // 0x13
  new Word("Sao"), // 0x14
  new Word("Ke"), // 0x15
  new Word("Yao"), // 0x16
  new Word("Dao"), // 0x17
  new Word("Zhi"), // 0x18
  new Word("Nu"), // 0x19
  new Word("Xie"), // 0x1a
  new Word("Jian"), // 0x1b
  new Word("Sou"), // 0x1c
  new Word("Qiu"), // 0x1d
  new Word("Gao"), // 0x1e
  new Word("Xian"), // 0x1f
  new Word("Shuo"), // 0x20
  new Word("Sang"), // 0x21
  new Word("Jin"), // 0x22
  new Word("Mie"), // 0x23
  new Word("E"), // 0x24
  new Word("Chui"), // 0x25
  new Word("Nuo"), // 0x26
  new Word("Shan"), // 0x27
  new Word("Ta"), // 0x28
  new Word("Jie"), // 0x29
  new Word("Tang"), // 0x2a
  new Word("Pan"), // 0x2b
  new Word("Ban"), // 0x2c
  new Word("Da"), // 0x2d
  new Word("Li"), // 0x2e
  new Word("Tao"), // 0x2f
  new Word("Hu"), // 0x30
  new Word("Zhi"), // 0x31
  new Word("Wa"), // 0x32
  new Word("Xia"), // 0x33
  new Word("Qian"), // 0x34
  new Word("Wen"), // 0x35
  new Word("Qiang"), // 0x36
  new Word("Tian"), // 0x37
  new Word("Zhen"), // 0x38
  new Word("E"), // 0x39
  new Word("Xi"), // 0x3a
  new Word("Nuo"), // 0x3b
  new Word("Quan"), // 0x3c
  new Word("Cha"), // 0x3d
  new Word("Zha"), // 0x3e
  new Word("Ge"), // 0x3f
  new Word("Wu"), // 0x40
  new Word("En"), // 0x41
  new Word("She"), // 0x42
  new Word("Kang"), // 0x43
  new Word("She"), // 0x44
  new Word("Shu"), // 0x45
  new Word("Bai"), // 0x46
  new Word("Yao"), // 0x47
  new Word("Bin"), // 0x48
  new Word("Sou"), // 0x49
  new Word("Tan"), // 0x4a
  new Word("Sa"), // 0x4b
  new Word("Chan"), // 0x4c
  new Word("Suo"), // 0x4d
  new Word("Liao"), // 0x4e
  new Word("Chong"), // 0x4f
  new Word("Chuang"), // 0x50
  new Word("Guo"), // 0x51
  new Word("Bing"), // 0x52
  new Word("Feng"), // 0x53
  new Word("Shuai"), // 0x54
  new Word("Di"), // 0x55
  new Word("Qi"), // 0x56
  new Word("Sou"), // 0x57
  new Word("Zhai"), // 0x58
  new Word("Lian"), // 0x59
  new Word("Tang"), // 0x5a
  new Word("Chi"), // 0x5b
  new Word("Guan"), // 0x5c
  new Word("Lu"), // 0x5d
  new Word("Luo"), // 0x5e
  new Word("Lou"), // 0x5f
  new Word("Zong"), // 0x60
  new Word("Gai"), // 0x61
  new Word("Hu"), // 0x62
  new Word("Zha"), // 0x63
  new Word("Chuang"), // 0x64
  new Word("Tang"), // 0x65
  new Word("Hua"), // 0x66
  new Word("Cui"), // 0x67
  new Word("Nai"), // 0x68
  new Word("Mo"), // 0x69
  new Word("Jiang"), // 0x6a
  new Word("Gui"), // 0x6b
  new Word("Ying"), // 0x6c
  new Word("Zhi"), // 0x6d
  new Word("Ao"), // 0x6e
  new Word("Zhi"), // 0x6f
  new Word("Nie"), // 0x70
  new Word("Man"), // 0x71
  new Word("Shan"), // 0x72
  new Word("Kou"), // 0x73
  new Word("Shu"), // 0x74
  new Word("Suo"), // 0x75
  new Word("Tuan"), // 0x76
  new Word("Jiao"), // 0x77
  new Word("Mo"), // 0x78
  new Word("Mo"), // 0x79
  new Word("Zhe"), // 0x7a
  new Word("Xian"), // 0x7b
  new Word("Keng"), // 0x7c
  new Word("Piao"), // 0x7d
  new Word("Jiang"), // 0x7e
  new Word("Yin"), // 0x7f
  new Word("Gou"), // 0x80
  new Word("Qian"), // 0x81
  new Word("Lue"), // 0x82
  new Word("Ji"), // 0x83
  new Word("Ying"), // 0x84
  new Word("Jue"), // 0x85
  new Word("Pie"), // 0x86
  new Word("Pie"), // 0x87
  new Word("Lao"), // 0x88
  new Word("Dun"), // 0x89
  new Word("Xian"), // 0x8a
  new Word("Ruan"), // 0x8b
  new Word("Kui"), // 0x8c
  new Word("Zan"), // 0x8d
  new Word("Yi"), // 0x8e
  new Word("Xun"), // 0x8f
  new Word("Cheng"), // 0x90
  new Word("Cheng"), // 0x91
  new Word("Sa"), // 0x92
  new Word("Nao"), // 0x93
  new Word("Heng"), // 0x94
  new Word("Si"), // 0x95
  new Word("Qian"), // 0x96
  new Word("Huang"), // 0x97
  new Word("Da"), // 0x98
  new Word("Zun"), // 0x99
  new Word("Nian"), // 0x9a
  new Word("Lin"), // 0x9b
  new Word("Zheng"), // 0x9c
  new Word("Hui"), // 0x9d
  new Word("Zhuang"), // 0x9e
  new Word("Jiao"), // 0x9f
  new Word("Ji"), // 0xa0
  new Word("Cao"), // 0xa1
  new Word("Dan"), // 0xa2
  new Word("Dan"), // 0xa3
  new Word("Che"), // 0xa4
  new Word("Bo"), // 0xa5
  new Word("Che"), // 0xa6
  new Word("Jue"), // 0xa7
  new Word("Xiao"), // 0xa8
  new Word("Liao"), // 0xa9
  new Word("Ben"), // 0xaa
  new Word("Fu"), // 0xab
  new Word("Qiao"), // 0xac
  new Word("Bo"), // 0xad
  new Word("Cuo"), // 0xae
  new Word("Zhuo"), // 0xaf
  new Word("Zhuan"), // 0xb0
  new Word("Tuo"), // 0xb1
  new Word("Pu"), // 0xb2
  new Word("Qin"), // 0xb3
  new Word("Dun"), // 0xb4
  new Word("Nian"), // 0xb5
  null, // 0xb6
  new Word("Xie"), // 0xb7
  new Word("Lu"), // 0xb8
  new Word("Jiao"), // 0xb9
  new Word("Cuan"), // 0xba
  new Word("Ta"), // 0xbb
  new Word("Han"), // 0xbc
  new Word("Qiao"), // 0xbd
  new Word("Zhua"), // 0xbe
  new Word("Jian"), // 0xbf
  new Word("Gan"), // 0xc0
  new Word("Yong"), // 0xc1
  new Word("Lei"), // 0xc2
  new Word("Kuo"), // 0xc3
  new Word("Lu"), // 0xc4
  new Word("Shan"), // 0xc5
  new Word("Zhuo"), // 0xc6
  new Word("Ze"), // 0xc7
  new Word("Pu"), // 0xc8
  new Word("Chuo"), // 0xc9
  new Word("Ji"), // 0xca
  new Word("Dang"), // 0xcb
  new Word("Suo"), // 0xcc
  new Word("Cao"), // 0xcd
  new Word("Qing"), // 0xce
  new Word("Jing"), // 0xcf
  new Word("Huan"), // 0xd0
  new Word("Jie"), // 0xd1
  new Word("Qin"), // 0xd2
  new Word("Kuai"), // 0xd3
  new Word("Dan"), // 0xd4
  new Word("Xi"), // 0xd5
  new Word("Ge"), // 0xd6
  new Word("Pi"), // 0xd7
  new Word("Bo"), // 0xd8
  new Word("Ao"), // 0xd9
  new Word("Ju"), // 0xda
  new Word("Ye"), // 0xdb
  null, // 0xdc
  new Word("Mang"), // 0xdd
  new Word("Sou"), // 0xde
  new Word("Mi"), // 0xdf
  new Word("Ji"), // 0xe0
  new Word("Tai"), // 0xe1
  new Word("Zhuo"), // 0xe2
  new Word("Dao"), // 0xe3
  new Word("Xing"), // 0xe4
  new Word("Lan"), // 0xe5
  new Word("Ca"), // 0xe6
  new Word("Ju"), // 0xe7
  new Word("Ye"), // 0xe8
  new Word("Ru"), // 0xe9
  new Word("Ye"), // 0xea
  new Word("Ye"), // 0xeb
  new Word("Ni"), // 0xec
  new Word("Hu"), // 0xed
  new Word("Ji"), // 0xee
  new Word("Bin"), // 0xef
  new Word("Ning"), // 0xf0
  new Word("Ge"), // 0xf1
  new Word("Zhi"), // 0xf2
  new Word("Jie"), // 0xf3
  new Word("Kuo"), // 0xf4
  new Word("Mo"), // 0xf5
  new Word("Jian"), // 0xf6
  new Word("Xie"), // 0xf7
  new Word("Lie"), // 0xf8
  new Word("Tan"), // 0xf9
  new Word("Bai"), // 0xfa
  new Word("Sou"), // 0xfb
  new Word("Lu"), // 0xfc
  new Word("Lue"), // 0xfd
  new Word("Rao"), // 0xfe
  new Word("Zhi") // 0xff
  };
}