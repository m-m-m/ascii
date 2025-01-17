/* Copyright c The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.text.ascii.impl;

/**
 * {@Yxx} for codepoint U+1Exx (Latin Extended Additional).
 */
final class X1e extends Xxx {

  public static final CodePointMapping[] MAP = new CodePointMapping[] { //
  Letter.UP_A, // 0x00
  Letter.LO_A, // 0x01
  Letter.UP_B, // 0x02
  Letter.LO_B, // 0x03
  Letter.UP_B, // 0x04
  Letter.LO_B, // 0x05
  Letter.UP_B, // 0x06
  Letter.LO_B, // 0x07
  Letter.UP_C, // 0x08
  Letter.LO_C, // 0x09
  Letter.UP_D, // 0x0a
  Letter.LO_D, // 0x0b
  Letter.UP_D, // 0x0c
  Letter.LO_D, // 0x0d
  Letter.UP_D, // 0x0e
  Letter.LO_D, // 0x0f
  Letter.UP_D, // 0x10
  Letter.LO_D, // 0x11
  Letter.UP_D, // 0x12
  Letter.LO_D, // 0x13
  Letter.UP_E, // 0x14
  Letter.LO_E, // 0x15
  Letter.UP_E, // 0x16
  Letter.LO_E, // 0x17
  Letter.UP_E, // 0x18
  Letter.LO_E, // 0x19
  Letter.UP_E, // 0x1a
  Letter.LO_E, // 0x1b
  Letter.UP_E, // 0x1c
  Letter.LO_E, // 0x1d
  Letter.UP_F, // 0x1e
  Letter.LO_F, // 0x1f
  Letter.UP_G, // 0x20
  Letter.LO_G, // 0x21
  Letter.UP_H, // 0x22
  Letter.LO_H, // 0x23
  Letter.UP_H, // 0x24
  Letter.LO_H, // 0x25
  Letter.UP_H, // 0x26
  Letter.LO_H, // 0x27
  Letter.UP_H, // 0x28
  Letter.LO_H, // 0x29
  Letter.UP_H, // 0x2a
  Letter.LO_H, // 0x2b
  Letter.UP_I, // 0x2c
  Letter.LO_I, // 0x2d
  Letter.UP_I, // 0x2e
  Letter.LO_I, // 0x2f
  Letter.UP_K, // 0x30
  Letter.LO_K, // 0x31
  Letter.UP_K, // 0x32
  Letter.LO_K, // 0x33
  Letter.UP_K, // 0x34
  Letter.LO_K, // 0x35
  Letter.UP_L, // 0x36
  Letter.LO_L, // 0x37
  Letter.UP_L, // 0x38
  Letter.LO_L, // 0x39
  Letter.UP_L, // 0x3a
  Letter.LO_L, // 0x3b
  Letter.UP_L, // 0x3c
  Letter.LO_L, // 0x3d
  Letter.UP_M, // 0x3e
  Letter.LO_M, // 0x3f
  Letter.UP_M, // 0x40
  Letter.LO_M, // 0x41
  Letter.UP_M, // 0x42
  Letter.LO_M, // 0x43
  Letter.UP_N, // 0x44
  Letter.LO_N, // 0x45
  Letter.UP_N, // 0x46
  Letter.LO_N, // 0x47
  Letter.UP_N, // 0x48
  Letter.LO_N, // 0x49
  Letter.UP_N, // 0x4a
  Letter.LO_N, // 0x4b
  Letter.UP_O, // 0x4c
  Letter.LO_O, // 0x4d
  Letter.UP_O, // 0x4e
  Letter.LO_O, // 0x4f
  Letter.UP_O, // 0x50
  Letter.LO_O, // 0x51
  Letter.UP_O, // 0x52
  Letter.LO_O, // 0x53
  Letter.UP_P, // 0x54
  Letter.LO_P, // 0x55
  Letter.UP_P, // 0x56
  Letter.LO_P, // 0x57
  Letter.UP_R, // 0x58
  Letter.LO_R, // 0x59
  Letter.UP_R, // 0x5a
  Letter.LO_R, // 0x5b
  Letter.UP_R, // 0x5c
  Letter.LO_R, // 0x5d
  Letter.UP_R, // 0x5e
  Letter.LO_R, // 0x5f
  Letter.UP_S, // 0x60
  Letter.LO_S, // 0x61
  Letter.UP_S, // 0x62
  Letter.LO_S, // 0x63
  Letter.UP_S, // 0x64
  Letter.LO_S, // 0x65
  Letter.UP_S, // 0x66
  Letter.LO_S, // 0x67
  Letter.UP_S, // 0x68
  Letter.LO_S, // 0x69
  Letter.UP_T, // 0x6a
  Letter.LO_T, // 0x6b
  Letter.UP_T, // 0x6c
  Letter.LO_T, // 0x6d
  Letter.UP_T, // 0x6e
  Letter.LO_T, // 0x6f
  Letter.UP_T, // 0x70
  Letter.LO_T, // 0x71
  Letter.UP_U, // 0x72
  Letter.LO_U, // 0x73
  Letter.UP_U, // 0x74
  Letter.LO_U, // 0x75
  Letter.UP_U, // 0x76
  Letter.LO_U, // 0x77
  Letter.UP_U, // 0x78
  Letter.LO_U, // 0x79
  Letter.UP_U, // 0x7a
  Letter.LO_U, // 0x7b
  Letter.UP_V, // 0x7c
  Letter.LO_V, // 0x7d
  Letter.UP_V, // 0x7e
  Letter.LO_V, // 0x7f
  Letter.UP_W, // 0x80
  Letter.LO_W, // 0x81
  Letter.UP_W, // 0x82
  Letter.LO_W, // 0x83
  Letter.UP_W, // 0x84
  Letter.LO_W, // 0x85
  Letter.UP_W, // 0x86
  Letter.LO_W, // 0x87
  Letter.UP_W, // 0x88
  Letter.LO_W, // 0x89
  Letter.UP_X, // 0x8a
  Letter.LO_X, // 0x8b
  Letter.UP_X, // 0x8c
  Letter.LO_X, // 0x8d
  Letter.UP_Y, // 0x8e
  Letter.LO_Y, // 0x8f
  Letter.UP_Z, // 0x90
  Letter.LO_Z, // 0x91
  Letter.UP_Z, // 0x92
  Letter.LO_Z, // 0x93
  Letter.UP_Z, // 0x94
  Letter.LO_Z, // 0x95
  Letter.LO_H, // 0x96
  Letter.LO_T, // 0x97
  Letter.LO_W, // 0x98
  Letter.LO_Y, // 0x99
  Letter.LO_A, // 0x9a
  Letter.LO_S, // 0x9b
  Letter.LO_S, // 0x9c
  Letter.LO_S, // 0x9d
  new Chars("Ss"), // 0x9e
  Letter.LO_D, // 0x9f
  Letter.UP_A, // 0xa0
  Letter.LO_A, // 0xa1
  Letter.UP_A, // 0xa2
  Letter.LO_A, // 0xa3
  Letter.UP_A, // 0xa4
  Letter.LO_A, // 0xa5
  Letter.UP_A, // 0xa6
  Letter.LO_A, // 0xa7
  Letter.UP_A, // 0xa8
  Letter.LO_A, // 0xa9
  Letter.UP_A, // 0xaa
  Letter.LO_A, // 0xab
  Letter.UP_A, // 0xac
  Letter.LO_A, // 0xad
  Letter.UP_A, // 0xae
  Letter.LO_A, // 0xaf
  Letter.UP_A, // 0xb0
  Letter.LO_A, // 0xb1
  Letter.UP_A, // 0xb2
  Letter.LO_A, // 0xb3
  Letter.UP_A, // 0xb4
  Letter.LO_A, // 0xb5
  Letter.UP_A, // 0xb6
  Letter.LO_A, // 0xb7
  Letter.UP_E, // 0xb8
  Letter.LO_E, // 0xb9
  Letter.UP_E, // 0xba
  Letter.LO_E, // 0xbb
  Letter.UP_E, // 0xbc
  Letter.LO_E, // 0xbd
  Letter.UP_E, // 0xbe
  Letter.LO_E, // 0xbf
  Letter.UP_E, // 0xc0
  Letter.LO_E, // 0xc1
  Letter.UP_E, // 0xc2
  Letter.LO_E, // 0xc3
  Letter.UP_E, // 0xc4
  Letter.LO_E, // 0xc5
  Letter.UP_E, // 0xc6
  Letter.LO_E, // 0xc7
  Letter.UP_I, // 0xc8
  Letter.LO_I, // 0xc9
  Letter.UP_I, // 0xca
  Letter.LO_I, // 0xcb
  Letter.UP_O, // 0xcc
  Letter.LO_O, // 0xcd
  Letter.UP_O, // 0xce
  Letter.LO_O, // 0xcf
  Letter.UP_O, // 0xd0
  Letter.LO_O, // 0xd1
  Letter.UP_O, // 0xd2
  Letter.LO_O, // 0xd3
  Letter.UP_O, // 0xd4
  Letter.LO_O, // 0xd5
  Letter.UP_O, // 0xd6
  Letter.LO_O, // 0xd7
  Letter.UP_O, // 0xd8
  Letter.LO_O, // 0xd9
  Letter.UP_O, // 0xda
  Letter.LO_O, // 0xdb
  Letter.UP_O, // 0xdc
  Letter.LO_O, // 0xdd
  Letter.UP_O, // 0xde
  Letter.LO_O, // 0xdf
  Letter.UP_O, // 0xe0
  Letter.LO_O, // 0xe1
  Letter.UP_O, // 0xe2
  Letter.LO_O, // 0xe3
  Letter.UP_U, // 0xe4
  Letter.LO_U, // 0xe5
  Letter.UP_U, // 0xe6
  Letter.LO_U, // 0xe7
  Letter.UP_U, // 0xe8
  Letter.LO_U, // 0xe9
  Letter.UP_U, // 0xea
  Letter.LO_U, // 0xeb
  Letter.UP_U, // 0xec
  Letter.LO_U, // 0xed
  Letter.UP_U, // 0xee
  Letter.LO_U, // 0xef
  Letter.UP_U, // 0xf0
  Letter.LO_U, // 0xf1
  Letter.UP_Y, // 0xf2
  Letter.LO_Y, // 0xf3
  Letter.UP_Y, // 0xf4
  Letter.LO_Y, // 0xf5
  Letter.UP_Y, // 0xf6
  Letter.LO_Y, // 0xf7
  Letter.UP_Y, // 0xf8
  Letter.LO_Y, // 0xf9
  UP_LL, // 0xfa
  LO_LL, // 0xfb
  Letter.UP_V, // 0xfc
  Letter.LO_V, // 0xfd
  Letter.UP_Y, // 0xfe
  Letter.LO_Y };
}