/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+9Axx (CJK Unified Ideographs).
 */
final class X9a extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  new Word("E"), // 0x00
  new Word("Cheng"), // 0x01
  new Word("Xin"), // 0x02
  new Word("Ai"), // 0x03
  new Word("Lu"), // 0x04
  new Word("Zhui"), // 0x05
  new Word("Zhou"), // 0x06
  new Word("She"), // 0x07
  new Word("Pian"), // 0x08
  new Word("Kun"), // 0x09
  new Word("Tao"), // 0x0a
  new Word("Lai"), // 0x0b
  new Word("Zong"), // 0x0c
  new Word("Ke"), // 0x0d
  new Word("Qi"), // 0x0e
  new Word("Qi"), // 0x0f
  new Word("Yan"), // 0x10
  new Word("Fei"), // 0x11
  new Word("Sao"), // 0x12
  new Word("Yan"), // 0x13
  new Word("Jie"), // 0x14
  new Word("Yao"), // 0x15
  new Word("Wu"), // 0x16
  new Word("Pian"), // 0x17
  new Word("Cong"), // 0x18
  new Word("Pian"), // 0x19
  new Word("Qian"), // 0x1a
  new Word("Fei"), // 0x1b
  new Word("Huang"), // 0x1c
  new Word("Jian"), // 0x1d
  new Word("Huo"), // 0x1e
  new Word("Yu"), // 0x1f
  new Word("Ti"), // 0x20
  new Word("Quan"), // 0x21
  new Word("Xia"), // 0x22
  new Word("Zong"), // 0x23
  new Word("Kui"), // 0x24
  new Word("Rou"), // 0x25
  new Word("Si"), // 0x26
  new Word("Gua"), // 0x27
  new Word("Tuo"), // 0x28
  new Word("Kui"), // 0x29
  new Word("Sou"), // 0x2a
  new Word("Qian"), // 0x2b
  new Word("Cheng"), // 0x2c
  new Word("Zhi"), // 0x2d
  new Word("Liu"), // 0x2e
  new Word("Pang"), // 0x2f
  new Word("Teng"), // 0x30
  new Word("Xi"), // 0x31
  new Word("Cao"), // 0x32
  new Word("Du"), // 0x33
  new Word("Yan"), // 0x34
  new Word("Yuan"), // 0x35
  new Word("Zou"), // 0x36
  new Word("Sao"), // 0x37
  new Word("Shan"), // 0x38
  new Word("Li"), // 0x39
  new Word("Zhi"), // 0x3a
  new Word("Shuang"), // 0x3b
  new Word("Lu"), // 0x3c
  new Word("Xi"), // 0x3d
  new Word("Luo"), // 0x3e
  new Word("Zhang"), // 0x3f
  new Word("Mo"), // 0x40
  new Word("Ao"), // 0x41
  new Word("Can"), // 0x42
  new Word("Piao"), // 0x43
  new Word("Cong"), // 0x44
  new Word("Qu"), // 0x45
  new Word("Bi"), // 0x46
  new Word("Zhi"), // 0x47
  new Word("Yu"), // 0x48
  new Word("Xu"), // 0x49
  new Word("Hua"), // 0x4a
  new Word("Bo"), // 0x4b
  new Word("Su"), // 0x4c
  new Word("Xiao"), // 0x4d
  new Word("Lin"), // 0x4e
  new Word("Chan"), // 0x4f
  new Word("Dun"), // 0x50
  new Word("Liu"), // 0x51
  new Word("Tuo"), // 0x52
  new Word("Zeng"), // 0x53
  new Word("Tan"), // 0x54
  new Word("Jiao"), // 0x55
  new Word("Tie"), // 0x56
  new Word("Yan"), // 0x57
  new Word("Luo"), // 0x58
  new Word("Zhan"), // 0x59
  new Word("Jing"), // 0x5a
  new Word("Yi"), // 0x5b
  new Word("Ye"), // 0x5c
  new Word("Tuo"), // 0x5d
  new Word("Bin"), // 0x5e
  new Word("Zou"), // 0x5f
  new Word("Yan"), // 0x60
  new Word("Peng"), // 0x61
  new Word("Lu"), // 0x62
  new Word("Teng"), // 0x63
  new Word("Xiang"), // 0x64
  new Word("Ji"), // 0x65
  new Word("Shuang"), // 0x66
  new Word("Ju"), // 0x67
  new Word("Xi"), // 0x68
  new Word("Huan"), // 0x69
  new Word("Li"), // 0x6a
  new Word("Biao"), // 0x6b
  new Word("Ma"), // 0x6c
  new Word("Yu"), // 0x6d
  new Word("Tuo"), // 0x6e
  new Word("Xun"), // 0x6f
  new Word("Chi"), // 0x70
  new Word("Qu"), // 0x71
  new Word("Ri"), // 0x72
  new Word("Bo"), // 0x73
  new Word("Lu"), // 0x74
  new Word("Zang"), // 0x75
  new Word("Shi"), // 0x76
  new Word("Si"), // 0x77
  new Word("Fu"), // 0x78
  new Word("Ju"), // 0x79
  new Word("Zou"), // 0x7a
  new Word("Zhu"), // 0x7b
  new Word("Tuo"), // 0x7c
  new Word("Nu"), // 0x7d
  new Word("Jia"), // 0x7e
  new Word("Yi"), // 0x7f
  new Word("Tai"), // 0x80
  new Word("Xiao"), // 0x81
  new Word("Ma"), // 0x82
  new Word("Yin"), // 0x83
  new Word("Jiao"), // 0x84
  new Word("Hua"), // 0x85
  new Word("Luo"), // 0x86
  new Word("Hai"), // 0x87
  new Word("Pian"), // 0x88
  new Word("Biao"), // 0x89
  new Word("Li"), // 0x8a
  new Word("Cheng"), // 0x8b
  new Word("Yan"), // 0x8c
  new Word("Xin"), // 0x8d
  new Word("Qin"), // 0x8e
  new Word("Jun"), // 0x8f
  new Word("Qi"), // 0x90
  new Word("Qi"), // 0x91
  new Word("Ke"), // 0x92
  new Word("Zhui"), // 0x93
  new Word("Zong"), // 0x94
  new Word("Su"), // 0x95
  new Word("Can"), // 0x96
  new Word("Pian"), // 0x97
  new Word("Zhi"), // 0x98
  new Word("Kui"), // 0x99
  new Word("Sao"), // 0x9a
  new Word("Wu"), // 0x9b
  new Word("Ao"), // 0x9c
  new Word("Liu"), // 0x9d
  new Word("Qian"), // 0x9e
  new Word("Shan"), // 0x9f
  new Word("Piao"), // 0xa0
  new Word("Luo"), // 0xa1
  new Word("Cong"), // 0xa2
  new Word("Chan"), // 0xa3
  new Word("Zou"), // 0xa4
  new Word("Ji"), // 0xa5
  new Word("Shuang"), // 0xa6
  new Word("Xiang"), // 0xa7
  new Word("Gu"), // 0xa8
  new Word("Wei"), // 0xa9
  new Word("Wei"), // 0xaa
  new Word("Wei"), // 0xab
  new Word("Yu"), // 0xac
  new Word("Gan"), // 0xad
  new Word("Yi"), // 0xae
  new Word("Ang"), // 0xaf
  new Word("Tou"), // 0xb0
  new Word("Xie"), // 0xb1
  new Word("Bao"), // 0xb2
  new Word("Bi"), // 0xb3
  new Word("Chi"), // 0xb4
  new Word("Ti"), // 0xb5
  new Word("Di"), // 0xb6
  new Word("Ku"), // 0xb7
  new Word("Hai"), // 0xb8
  new Word("Qiao"), // 0xb9
  new Word("Gou"), // 0xba
  new Word("Kua"), // 0xbb
  new Word("Ge"), // 0xbc
  new Word("Tui"), // 0xbd
  new Word("Geng"), // 0xbe
  new Word("Pian"), // 0xbf
  new Word("Bi"), // 0xc0
  new Word("Ke"), // 0xc1
  new Word("Ka"), // 0xc2
  new Word("Yu"), // 0xc3
  new Word("Sui"), // 0xc4
  new Word("Lou"), // 0xc5
  new Word("Bo"), // 0xc6
  new Word("Xiao"), // 0xc7
  new Word("Pang"), // 0xc8
  new Word("Bo"), // 0xc9
  new Word("Ci"), // 0xca
  new Word("Kuan"), // 0xcb
  new Word("Bin"), // 0xcc
  new Word("Mo"), // 0xcd
  new Word("Liao"), // 0xce
  new Word("Lou"), // 0xcf
  new Word("Nao"), // 0xd0
  new Word("Du"), // 0xd1
  new Word("Zang"), // 0xd2
  new Word("Sui"), // 0xd3
  new Word("Ti"), // 0xd4
  new Word("Bin"), // 0xd5
  new Word("Kuan"), // 0xd6
  new Word("Lu"), // 0xd7
  new Word("Gao"), // 0xd8
  new Word("Gao"), // 0xd9
  new Word("Qiao"), // 0xda
  new Word("Kao"), // 0xdb
  new Word("Qiao"), // 0xdc
  new Word("Lao"), // 0xdd
  new Word("Zao"), // 0xde
  new Word("Biao"), // 0xdf
  new Word("Kun"), // 0xe0
  new Word("Kun"), // 0xe1
  new Word("Ti"), // 0xe2
  new Word("Fang"), // 0xe3
  new Word("Xiu"), // 0xe4
  new Word("Ran"), // 0xe5
  new Word("Mao"), // 0xe6
  new Word("Dan"), // 0xe7
  new Word("Kun"), // 0xe8
  new Word("Bin"), // 0xe9
  new Word("Fa"), // 0xea
  new Word("Tiao"), // 0xeb
  new Word("Peng"), // 0xec
  new Word("Zi"), // 0xed
  new Word("Fa"), // 0xee
  new Word("Ran"), // 0xef
  new Word("Ti"), // 0xf0
  new Word("Pao"), // 0xf1
  new Word("Pi"), // 0xf2
  new Word("Mao"), // 0xf3
  new Word("Fu"), // 0xf4
  new Word("Er"), // 0xf5
  new Word("Rong"), // 0xf6
  new Word("Qu"), // 0xf7
  new Word("Gong"), // 0xf8
  new Word("Xiu"), // 0xf9
  new Word("Gua"), // 0xfa
  new Word("Ji"), // 0xfb
  new Word("Peng"), // 0xfc
  new Word("Zhua"), // 0xfd
  new Word("Shao"), // 0xfe
  new Word("Sha") // 0xff
  };
}