package com.lucidchart.relate

import java.sql._
import java.util.Properties

object Init {
  Class.forName("org.h2.Driver")

  val props = new Properties()
  props.put("MODE", "MySQL")
  val conn = DriverManager.getConnection("jdbc:h2:mem:test", props)

  sql"""CREATE TABLE ins_10 (
  col1 text,
  col2 text,
  col3 text,
  col4 text,
  col5 text,
  col6 text,
  col7 text,
  col8 text,
  col9 text,
  col10 text
)""".execute()(conn)

  sql"""CREATE TABLE ins_100 (
  col1 int(11) DEFAULT NULL,
  col2 int(11) DEFAULT NULL,
  col3 int(11) DEFAULT NULL,
  col4 int(11) DEFAULT NULL,
  col5 int(11) DEFAULT NULL,
  col6 int(11) DEFAULT NULL,
  col7 int(11) DEFAULT NULL,
  col8 int(11) DEFAULT NULL,
  col9 int(11) DEFAULT NULL,
  col10 int(11) DEFAULT NULL,
  col11 int(11) DEFAULT NULL,
  col12 int(11) DEFAULT NULL,
  col13 int(11) DEFAULT NULL,
  col14 int(11) DEFAULT NULL,
  col15 int(11) DEFAULT NULL,
  col16 int(11) DEFAULT NULL,
  col17 int(11) DEFAULT NULL,
  col18 int(11) DEFAULT NULL,
  col19 int(11) DEFAULT NULL,
  col20 int(11) DEFAULT NULL,
  col21 int(11) DEFAULT NULL,
  col22 int(11) DEFAULT NULL,
  col23 int(11) DEFAULT NULL,
  col24 int(11) DEFAULT NULL,
  col25 int(11) DEFAULT NULL,
  col26 int(11) DEFAULT NULL,
  col27 int(11) DEFAULT NULL,
  col28 int(11) DEFAULT NULL,
  col29 int(11) DEFAULT NULL,
  col30 int(11) DEFAULT NULL,
  col31 int(11) DEFAULT NULL,
  col32 int(11) DEFAULT NULL,
  col33 int(11) DEFAULT NULL,
  col34 int(11) DEFAULT NULL,
  col35 int(11) DEFAULT NULL,
  col36 int(11) DEFAULT NULL,
  col37 int(11) DEFAULT NULL,
  col38 int(11) DEFAULT NULL,
  col39 int(11) DEFAULT NULL,
  col40 int(11) DEFAULT NULL,
  col41 int(11) DEFAULT NULL,
  col42 int(11) DEFAULT NULL,
  col43 int(11) DEFAULT NULL,
  col44 int(11) DEFAULT NULL,
  col45 int(11) DEFAULT NULL,
  col46 int(11) DEFAULT NULL,
  col47 int(11) DEFAULT NULL,
  col48 int(11) DEFAULT NULL,
  col49 int(11) DEFAULT NULL,
  col50 int(11) DEFAULT NULL,
  col51 int(11) DEFAULT NULL,
  col52 int(11) DEFAULT NULL,
  col53 int(11) DEFAULT NULL,
  col54 int(11) DEFAULT NULL,
  col55 int(11) DEFAULT NULL,
  col56 int(11) DEFAULT NULL,
  col57 int(11) DEFAULT NULL,
  col58 int(11) DEFAULT NULL,
  col59 int(11) DEFAULT NULL,
  col60 int(11) DEFAULT NULL,
  col61 int(11) DEFAULT NULL,
  col62 int(11) DEFAULT NULL,
  col63 int(11) DEFAULT NULL,
  col64 int(11) DEFAULT NULL,
  col65 int(11) DEFAULT NULL,
  col66 int(11) DEFAULT NULL,
  col67 int(11) DEFAULT NULL,
  col68 int(11) DEFAULT NULL,
  col69 int(11) DEFAULT NULL,
  col70 int(11) DEFAULT NULL,
  col71 int(11) DEFAULT NULL,
  col72 int(11) DEFAULT NULL,
  col73 int(11) DEFAULT NULL,
  col74 int(11) DEFAULT NULL,
  col75 int(11) DEFAULT NULL,
  col76 int(11) DEFAULT NULL,
  col77 int(11) DEFAULT NULL,
  col78 int(11) DEFAULT NULL,
  col79 int(11) DEFAULT NULL,
  col80 int(11) DEFAULT NULL,
  col81 int(11) DEFAULT NULL,
  col82 int(11) DEFAULT NULL,
  col83 int(11) DEFAULT NULL,
  col84 int(11) DEFAULT NULL,
  col85 int(11) DEFAULT NULL,
  col86 int(11) DEFAULT NULL,
  col87 int(11) DEFAULT NULL,
  col88 int(11) DEFAULT NULL,
  col89 int(11) DEFAULT NULL,
  col90 int(11) DEFAULT NULL,
  col91 int(11) DEFAULT NULL,
  col92 int(11) DEFAULT NULL,
  col93 int(11) DEFAULT NULL,
  col94 int(11) DEFAULT NULL,
  col95 int(11) DEFAULT NULL,
  col96 int(11) DEFAULT NULL,
  col97 int(11) DEFAULT NULL,
  col98 int(11) DEFAULT NULL,
  col99 int(11) DEFAULT NULL,
  col100 int(11) DEFAULT NULL
)""".execute()(conn)

  sql"""CREATE TABLE ins_200 (
  col1 int(11) DEFAULT NULL,
  col2 int(11) DEFAULT NULL,
  col3 int(11) DEFAULT NULL,
  col4 int(11) DEFAULT NULL,
  col5 int(11) DEFAULT NULL,
  col6 int(11) DEFAULT NULL,
  col7 int(11) DEFAULT NULL,
  col8 int(11) DEFAULT NULL,
  col9 int(11) DEFAULT NULL,
  col10 int(11) DEFAULT NULL,
  col11 int(11) DEFAULT NULL,
  col12 int(11) DEFAULT NULL,
  col13 int(11) DEFAULT NULL,
  col14 int(11) DEFAULT NULL,
  col15 int(11) DEFAULT NULL,
  col16 int(11) DEFAULT NULL,
  col17 int(11) DEFAULT NULL,
  col18 int(11) DEFAULT NULL,
  col19 int(11) DEFAULT NULL,
  col20 int(11) DEFAULT NULL,
  col21 int(11) DEFAULT NULL,
  col22 int(11) DEFAULT NULL,
  col23 int(11) DEFAULT NULL,
  col24 int(11) DEFAULT NULL,
  col25 int(11) DEFAULT NULL,
  col26 int(11) DEFAULT NULL,
  col27 int(11) DEFAULT NULL,
  col28 int(11) DEFAULT NULL,
  col29 int(11) DEFAULT NULL,
  col30 int(11) DEFAULT NULL,
  col31 int(11) DEFAULT NULL,
  col32 int(11) DEFAULT NULL,
  col33 int(11) DEFAULT NULL,
  col34 int(11) DEFAULT NULL,
  col35 int(11) DEFAULT NULL,
  col36 int(11) DEFAULT NULL,
  col37 int(11) DEFAULT NULL,
  col38 int(11) DEFAULT NULL,
  col39 int(11) DEFAULT NULL,
  col40 int(11) DEFAULT NULL,
  col41 int(11) DEFAULT NULL,
  col42 int(11) DEFAULT NULL,
  col43 int(11) DEFAULT NULL,
  col44 int(11) DEFAULT NULL,
  col45 int(11) DEFAULT NULL,
  col46 int(11) DEFAULT NULL,
  col47 int(11) DEFAULT NULL,
  col48 int(11) DEFAULT NULL,
  col49 int(11) DEFAULT NULL,
  col50 int(11) DEFAULT NULL,
  col51 int(11) DEFAULT NULL,
  col52 int(11) DEFAULT NULL,
  col53 int(11) DEFAULT NULL,
  col54 int(11) DEFAULT NULL,
  col55 int(11) DEFAULT NULL,
  col56 int(11) DEFAULT NULL,
  col57 int(11) DEFAULT NULL,
  col58 int(11) DEFAULT NULL,
  col59 int(11) DEFAULT NULL,
  col60 int(11) DEFAULT NULL,
  col61 int(11) DEFAULT NULL,
  col62 int(11) DEFAULT NULL,
  col63 int(11) DEFAULT NULL,
  col64 int(11) DEFAULT NULL,
  col65 int(11) DEFAULT NULL,
  col66 int(11) DEFAULT NULL,
  col67 int(11) DEFAULT NULL,
  col68 int(11) DEFAULT NULL,
  col69 int(11) DEFAULT NULL,
  col70 int(11) DEFAULT NULL,
  col71 int(11) DEFAULT NULL,
  col72 int(11) DEFAULT NULL,
  col73 int(11) DEFAULT NULL,
  col74 int(11) DEFAULT NULL,
  col75 int(11) DEFAULT NULL,
  col76 int(11) DEFAULT NULL,
  col77 int(11) DEFAULT NULL,
  col78 int(11) DEFAULT NULL,
  col79 int(11) DEFAULT NULL,
  col80 int(11) DEFAULT NULL,
  col81 int(11) DEFAULT NULL,
  col82 int(11) DEFAULT NULL,
  col83 int(11) DEFAULT NULL,
  col84 int(11) DEFAULT NULL,
  col85 int(11) DEFAULT NULL,
  col86 int(11) DEFAULT NULL,
  col87 int(11) DEFAULT NULL,
  col88 int(11) DEFAULT NULL,
  col89 int(11) DEFAULT NULL,
  col90 int(11) DEFAULT NULL,
  col91 int(11) DEFAULT NULL,
  col92 int(11) DEFAULT NULL,
  col93 int(11) DEFAULT NULL,
  col94 int(11) DEFAULT NULL,
  col95 int(11) DEFAULT NULL,
  col96 int(11) DEFAULT NULL,
  col97 int(11) DEFAULT NULL,
  col98 int(11) DEFAULT NULL,
  col99 int(11) DEFAULT NULL,
  col100 int(11) DEFAULT NULL,
  col101 int(11) DEFAULT NULL,
  col102 int(11) DEFAULT NULL,
  col103 int(11) DEFAULT NULL,
  col104 int(11) DEFAULT NULL,
  col105 int(11) DEFAULT NULL,
  col106 int(11) DEFAULT NULL,
  col107 int(11) DEFAULT NULL,
  col108 int(11) DEFAULT NULL,
  col109 int(11) DEFAULT NULL,
  col110 int(11) DEFAULT NULL,
  col111 int(11) DEFAULT NULL,
  col112 int(11) DEFAULT NULL,
  col113 int(11) DEFAULT NULL,
  col114 int(11) DEFAULT NULL,
  col115 int(11) DEFAULT NULL,
  col116 int(11) DEFAULT NULL,
  col117 int(11) DEFAULT NULL,
  col118 int(11) DEFAULT NULL,
  col119 int(11) DEFAULT NULL,
  col120 int(11) DEFAULT NULL,
  col121 int(11) DEFAULT NULL,
  col122 int(11) DEFAULT NULL,
  col123 int(11) DEFAULT NULL,
  col124 int(11) DEFAULT NULL,
  col125 int(11) DEFAULT NULL,
  col126 int(11) DEFAULT NULL,
  col127 int(11) DEFAULT NULL,
  col128 int(11) DEFAULT NULL,
  col129 int(11) DEFAULT NULL,
  col130 int(11) DEFAULT NULL,
  col131 int(11) DEFAULT NULL,
  col132 int(11) DEFAULT NULL,
  col133 int(11) DEFAULT NULL,
  col134 int(11) DEFAULT NULL,
  col135 int(11) DEFAULT NULL,
  col136 int(11) DEFAULT NULL,
  col137 int(11) DEFAULT NULL,
  col138 int(11) DEFAULT NULL,
  col139 int(11) DEFAULT NULL,
  col140 int(11) DEFAULT NULL,
  col141 int(11) DEFAULT NULL,
  col142 int(11) DEFAULT NULL,
  col143 int(11) DEFAULT NULL,
  col144 int(11) DEFAULT NULL,
  col145 int(11) DEFAULT NULL,
  col146 int(11) DEFAULT NULL,
  col147 int(11) DEFAULT NULL,
  col148 int(11) DEFAULT NULL,
  col149 int(11) DEFAULT NULL,
  col150 int(11) DEFAULT NULL,
  col151 int(11) DEFAULT NULL,
  col152 int(11) DEFAULT NULL,
  col153 int(11) DEFAULT NULL,
  col154 int(11) DEFAULT NULL,
  col155 int(11) DEFAULT NULL,
  col156 int(11) DEFAULT NULL,
  col157 int(11) DEFAULT NULL,
  col158 int(11) DEFAULT NULL,
  col159 int(11) DEFAULT NULL,
  col160 int(11) DEFAULT NULL,
  col161 int(11) DEFAULT NULL,
  col162 int(11) DEFAULT NULL,
  col163 int(11) DEFAULT NULL,
  col164 int(11) DEFAULT NULL,
  col165 int(11) DEFAULT NULL,
  col166 int(11) DEFAULT NULL,
  col167 int(11) DEFAULT NULL,
  col168 int(11) DEFAULT NULL,
  col169 int(11) DEFAULT NULL,
  col170 int(11) DEFAULT NULL,
  col171 int(11) DEFAULT NULL,
  col172 int(11) DEFAULT NULL,
  col173 int(11) DEFAULT NULL,
  col174 int(11) DEFAULT NULL,
  col175 int(11) DEFAULT NULL,
  col176 int(11) DEFAULT NULL,
  col177 int(11) DEFAULT NULL,
  col178 int(11) DEFAULT NULL,
  col179 int(11) DEFAULT NULL,
  col180 int(11) DEFAULT NULL,
  col181 int(11) DEFAULT NULL,
  col182 int(11) DEFAULT NULL,
  col183 int(11) DEFAULT NULL,
  col184 int(11) DEFAULT NULL,
  col185 int(11) DEFAULT NULL,
  col186 int(11) DEFAULT NULL,
  col187 int(11) DEFAULT NULL,
  col188 int(11) DEFAULT NULL,
  col189 int(11) DEFAULT NULL,
  col190 int(11) DEFAULT NULL,
  col191 int(11) DEFAULT NULL,
  col192 int(11) DEFAULT NULL,
  col193 int(11) DEFAULT NULL,
  col194 int(11) DEFAULT NULL,
  col195 int(11) DEFAULT NULL,
  col196 int(11) DEFAULT NULL,
  col197 int(11) DEFAULT NULL,
  col198 int(11) DEFAULT NULL,
  col199 int(11) DEFAULT NULL,
  col200 int(11) DEFAULT NULL
)""".execute()(conn)

  sql"""CREATE TABLE ins_50 (
  col1 int(11) DEFAULT NULL,
  col2 int(11) DEFAULT NULL,
  col3 int(11) DEFAULT NULL,
  col4 int(11) DEFAULT NULL,
  col5 int(11) DEFAULT NULL,
  col6 int(11) DEFAULT NULL,
  col7 int(11) DEFAULT NULL,
  col8 int(11) DEFAULT NULL,
  col9 int(11) DEFAULT NULL,
  col10 int(11) DEFAULT NULL,
  col11 int(11) DEFAULT NULL,
  col12 int(11) DEFAULT NULL,
  col13 int(11) DEFAULT NULL,
  col14 int(11) DEFAULT NULL,
  col15 int(11) DEFAULT NULL,
  col16 int(11) DEFAULT NULL,
  col17 int(11) DEFAULT NULL,
  col18 int(11) DEFAULT NULL,
  col19 int(11) DEFAULT NULL,
  col20 int(11) DEFAULT NULL,
  col21 int(11) DEFAULT NULL,
  col22 int(11) DEFAULT NULL,
  col23 int(11) DEFAULT NULL,
  col24 int(11) DEFAULT NULL,
  col25 int(11) DEFAULT NULL,
  col26 int(11) DEFAULT NULL,
  col27 int(11) DEFAULT NULL,
  col28 int(11) DEFAULT NULL,
  col29 int(11) DEFAULT NULL,
  col30 int(11) DEFAULT NULL,
  col31 int(11) DEFAULT NULL,
  col32 int(11) DEFAULT NULL,
  col33 int(11) DEFAULT NULL,
  col34 int(11) DEFAULT NULL,
  col35 int(11) DEFAULT NULL,
  col36 int(11) DEFAULT NULL,
  col37 int(11) DEFAULT NULL,
  col38 int(11) DEFAULT NULL,
  col39 int(11) DEFAULT NULL,
  col40 int(11) DEFAULT NULL,
  col41 int(11) DEFAULT NULL,
  col42 int(11) DEFAULT NULL,
  col43 int(11) DEFAULT NULL,
  col44 int(11) DEFAULT NULL,
  col45 int(11) DEFAULT NULL,
  col46 int(11) DEFAULT NULL,
  col47 int(11) DEFAULT NULL,
  col48 int(11) DEFAULT NULL,
  col49 int(11) DEFAULT NULL,
  col50 int(11) DEFAULT NULL
)""".execute()(conn)

  sql"""CREATE TABLE sel_200 (
  col1 int(11) DEFAULT NULL,
  col2 int(11) DEFAULT NULL,
  col3 int(11) DEFAULT NULL,
  col4 int(11) DEFAULT NULL,
  col5 int(11) DEFAULT NULL,
  col6 int(11) DEFAULT NULL,
  col7 int(11) DEFAULT NULL,
  col8 int(11) DEFAULT NULL,
  col9 int(11) DEFAULT NULL,
  col10 int(11) DEFAULT NULL,
  col11 int(11) DEFAULT NULL,
  col12 int(11) DEFAULT NULL,
  col13 int(11) DEFAULT NULL,
  col14 int(11) DEFAULT NULL,
  col15 int(11) DEFAULT NULL,
  col16 int(11) DEFAULT NULL,
  col17 int(11) DEFAULT NULL,
  col18 int(11) DEFAULT NULL,
  col19 int(11) DEFAULT NULL,
  col20 int(11) DEFAULT NULL,
  col21 int(11) DEFAULT NULL,
  col22 int(11) DEFAULT NULL,
  col23 int(11) DEFAULT NULL,
  col24 int(11) DEFAULT NULL,
  col25 int(11) DEFAULT NULL,
  col26 int(11) DEFAULT NULL,
  col27 int(11) DEFAULT NULL,
  col28 int(11) DEFAULT NULL,
  col29 int(11) DEFAULT NULL,
  col30 int(11) DEFAULT NULL,
  col31 int(11) DEFAULT NULL,
  col32 int(11) DEFAULT NULL,
  col33 int(11) DEFAULT NULL,
  col34 int(11) DEFAULT NULL,
  col35 int(11) DEFAULT NULL,
  col36 int(11) DEFAULT NULL,
  col37 int(11) DEFAULT NULL,
  col38 int(11) DEFAULT NULL,
  col39 int(11) DEFAULT NULL,
  col40 int(11) DEFAULT NULL,
  col41 int(11) DEFAULT NULL,
  col42 int(11) DEFAULT NULL,
  col43 int(11) DEFAULT NULL,
  col44 int(11) DEFAULT NULL,
  col45 int(11) DEFAULT NULL,
  col46 int(11) DEFAULT NULL,
  col47 int(11) DEFAULT NULL,
  col48 int(11) DEFAULT NULL,
  col49 int(11) DEFAULT NULL,
  col50 int(11) DEFAULT NULL,
  col51 int(11) DEFAULT NULL,
  col52 int(11) DEFAULT NULL,
  col53 int(11) DEFAULT NULL,
  col54 int(11) DEFAULT NULL,
  col55 int(11) DEFAULT NULL,
  col56 int(11) DEFAULT NULL,
  col57 int(11) DEFAULT NULL,
  col58 int(11) DEFAULT NULL,
  col59 int(11) DEFAULT NULL,
  col60 int(11) DEFAULT NULL,
  col61 int(11) DEFAULT NULL,
  col62 int(11) DEFAULT NULL,
  col63 int(11) DEFAULT NULL,
  col64 int(11) DEFAULT NULL,
  col65 int(11) DEFAULT NULL,
  col66 int(11) DEFAULT NULL,
  col67 int(11) DEFAULT NULL,
  col68 int(11) DEFAULT NULL,
  col69 int(11) DEFAULT NULL,
  col70 int(11) DEFAULT NULL,
  col71 int(11) DEFAULT NULL,
  col72 int(11) DEFAULT NULL,
  col73 int(11) DEFAULT NULL,
  col74 int(11) DEFAULT NULL,
  col75 int(11) DEFAULT NULL,
  col76 int(11) DEFAULT NULL,
  col77 int(11) DEFAULT NULL,
  col78 int(11) DEFAULT NULL,
  col79 int(11) DEFAULT NULL,
  col80 int(11) DEFAULT NULL,
  col81 int(11) DEFAULT NULL,
  col82 int(11) DEFAULT NULL,
  col83 int(11) DEFAULT NULL,
  col84 int(11) DEFAULT NULL,
  col85 int(11) DEFAULT NULL,
  col86 int(11) DEFAULT NULL,
  col87 int(11) DEFAULT NULL,
  col88 int(11) DEFAULT NULL,
  col89 int(11) DEFAULT NULL,
  col90 int(11) DEFAULT NULL,
  col91 int(11) DEFAULT NULL,
  col92 int(11) DEFAULT NULL,
  col93 int(11) DEFAULT NULL,
  col94 int(11) DEFAULT NULL,
  col95 int(11) DEFAULT NULL,
  col96 int(11) DEFAULT NULL,
  col97 int(11) DEFAULT NULL,
  col98 int(11) DEFAULT NULL,
  col99 int(11) DEFAULT NULL,
  col100 int(11) DEFAULT NULL,
  col101 int(11) DEFAULT NULL,
  col102 int(11) DEFAULT NULL,
  col103 int(11) DEFAULT NULL,
  col104 int(11) DEFAULT NULL,
  col105 int(11) DEFAULT NULL,
  col106 int(11) DEFAULT NULL,
  col107 int(11) DEFAULT NULL,
  col108 int(11) DEFAULT NULL,
  col109 int(11) DEFAULT NULL,
  col110 int(11) DEFAULT NULL,
  col111 int(11) DEFAULT NULL,
  col112 int(11) DEFAULT NULL,
  col113 int(11) DEFAULT NULL,
  col114 int(11) DEFAULT NULL,
  col115 int(11) DEFAULT NULL,
  col116 int(11) DEFAULT NULL,
  col117 int(11) DEFAULT NULL,
  col118 int(11) DEFAULT NULL,
  col119 int(11) DEFAULT NULL,
  col120 int(11) DEFAULT NULL,
  col121 int(11) DEFAULT NULL,
  col122 int(11) DEFAULT NULL,
  col123 int(11) DEFAULT NULL,
  col124 int(11) DEFAULT NULL,
  col125 int(11) DEFAULT NULL,
  col126 int(11) DEFAULT NULL,
  col127 int(11) DEFAULT NULL,
  col128 int(11) DEFAULT NULL,
  col129 int(11) DEFAULT NULL,
  col130 int(11) DEFAULT NULL,
  col131 int(11) DEFAULT NULL,
  col132 int(11) DEFAULT NULL,
  col133 int(11) DEFAULT NULL,
  col134 int(11) DEFAULT NULL,
  col135 int(11) DEFAULT NULL,
  col136 int(11) DEFAULT NULL,
  col137 int(11) DEFAULT NULL,
  col138 int(11) DEFAULT NULL,
  col139 int(11) DEFAULT NULL,
  col140 int(11) DEFAULT NULL,
  col141 int(11) DEFAULT NULL,
  col142 int(11) DEFAULT NULL,
  col143 int(11) DEFAULT NULL,
  col144 int(11) DEFAULT NULL,
  col145 int(11) DEFAULT NULL,
  col146 int(11) DEFAULT NULL,
  col147 int(11) DEFAULT NULL,
  col148 int(11) DEFAULT NULL,
  col149 int(11) DEFAULT NULL,
  col150 int(11) DEFAULT NULL,
  col151 int(11) DEFAULT NULL,
  col152 int(11) DEFAULT NULL,
  col153 int(11) DEFAULT NULL,
  col154 int(11) DEFAULT NULL,
  col155 int(11) DEFAULT NULL,
  col156 int(11) DEFAULT NULL,
  col157 int(11) DEFAULT NULL,
  col158 int(11) DEFAULT NULL,
  col159 int(11) DEFAULT NULL,
  col160 int(11) DEFAULT NULL,
  col161 int(11) DEFAULT NULL,
  col162 int(11) DEFAULT NULL,
  col163 int(11) DEFAULT NULL,
  col164 int(11) DEFAULT NULL,
  col165 int(11) DEFAULT NULL,
  col166 int(11) DEFAULT NULL,
  col167 int(11) DEFAULT NULL,
  col168 int(11) DEFAULT NULL,
  col169 int(11) DEFAULT NULL,
  col170 int(11) DEFAULT NULL,
  col171 int(11) DEFAULT NULL,
  col172 int(11) DEFAULT NULL,
  col173 int(11) DEFAULT NULL,
  col174 int(11) DEFAULT NULL,
  col175 int(11) DEFAULT NULL,
  col176 int(11) DEFAULT NULL,
  col177 int(11) DEFAULT NULL,
  col178 int(11) DEFAULT NULL,
  col179 int(11) DEFAULT NULL,
  col180 int(11) DEFAULT NULL,
  col181 int(11) DEFAULT NULL,
  col182 int(11) DEFAULT NULL,
  col183 int(11) DEFAULT NULL,
  col184 int(11) DEFAULT NULL,
  col185 int(11) DEFAULT NULL,
  col186 int(11) DEFAULT NULL,
  col187 int(11) DEFAULT NULL,
  col188 int(11) DEFAULT NULL,
  col189 int(11) DEFAULT NULL,
  col190 int(11) DEFAULT NULL,
  col191 int(11) DEFAULT NULL,
  col192 int(11) DEFAULT NULL,
  col193 int(11) DEFAULT NULL,
  col194 int(11) DEFAULT NULL,
  col195 int(11) DEFAULT NULL,
  col196 int(11) DEFAULT NULL,
  col197 int(11) DEFAULT NULL,
  col198 int(11) DEFAULT NULL,
  col199 int(11) DEFAULT NULL,
  col200 int(11) DEFAULT NULL
)""".execute()(conn)

  sql"""CREATE TABLE sel_50 (
  col1 text,
  col2 text,
  col3 text,
  col4 text,
  col5 text,
  col6 text,
  col7 text,
  col8 text,
  col9 text,
  col10 text,
  col11 text,
  col12 text,
  col13 text,
  col14 text,
  col15 text,
  col16 text,
  col17 text,
  col18 text,
  col19 text,
  col20 text,
  col21 text,
  col22 text,
  col23 text,
  col24 text,
  col25 text,
  col26 text,
  col27 text,
  col28 text,
  col29 text,
  col30 text,
  col31 text,
  col32 text,
  col33 text,
  col34 text,
  col35 text,
  col36 text,
  col37 text,
  col38 text,
  col39 text,
  col40 text,
  col41 text,
  col42 text,
  col43 text,
  col44 text,
  col45 text,
  col46 text,
  col47 text,
  col48 text,
  col49 text,
  col50 text
)""".execute()(conn)

  sql"""CREATE TABLE sel_dates_200 (
  col1 date DEFAULT NULL,
  col2 date DEFAULT NULL,
  col3 date DEFAULT NULL,
  col4 date DEFAULT NULL,
  col5 date DEFAULT NULL,
  col6 date DEFAULT NULL,
  col7 date DEFAULT NULL,
  col8 date DEFAULT NULL,
  col9 date DEFAULT NULL,
  col10 date DEFAULT NULL,
  col11 date DEFAULT NULL,
  col12 date DEFAULT NULL,
  col13 date DEFAULT NULL,
  col14 date DEFAULT NULL,
  col15 date DEFAULT NULL,
  col16 date DEFAULT NULL,
  col17 date DEFAULT NULL,
  col18 date DEFAULT NULL,
  col19 date DEFAULT NULL,
  col20 date DEFAULT NULL,
  col21 date DEFAULT NULL,
  col22 date DEFAULT NULL,
  col23 date DEFAULT NULL,
  col24 date DEFAULT NULL,
  col25 date DEFAULT NULL,
  col26 date DEFAULT NULL,
  col27 date DEFAULT NULL,
  col28 date DEFAULT NULL,
  col29 date DEFAULT NULL,
  col30 date DEFAULT NULL,
  col31 date DEFAULT NULL,
  col32 date DEFAULT NULL,
  col33 date DEFAULT NULL,
  col34 date DEFAULT NULL,
  col35 date DEFAULT NULL,
  col36 date DEFAULT NULL,
  col37 date DEFAULT NULL,
  col38 date DEFAULT NULL,
  col39 date DEFAULT NULL,
  col40 date DEFAULT NULL,
  col41 date DEFAULT NULL,
  col42 date DEFAULT NULL,
  col43 date DEFAULT NULL,
  col44 date DEFAULT NULL,
  col45 date DEFAULT NULL,
  col46 date DEFAULT NULL,
  col47 date DEFAULT NULL,
  col48 date DEFAULT NULL,
  col49 date DEFAULT NULL,
  col50 date DEFAULT NULL,
  col51 date DEFAULT NULL,
  col52 date DEFAULT NULL,
  col53 date DEFAULT NULL,
  col54 date DEFAULT NULL,
  col55 date DEFAULT NULL,
  col56 date DEFAULT NULL,
  col57 date DEFAULT NULL,
  col58 date DEFAULT NULL,
  col59 date DEFAULT NULL,
  col60 date DEFAULT NULL,
  col61 date DEFAULT NULL,
  col62 date DEFAULT NULL,
  col63 date DEFAULT NULL,
  col64 date DEFAULT NULL,
  col65 date DEFAULT NULL,
  col66 date DEFAULT NULL,
  col67 date DEFAULT NULL,
  col68 date DEFAULT NULL,
  col69 date DEFAULT NULL,
  col70 date DEFAULT NULL,
  col71 date DEFAULT NULL,
  col72 date DEFAULT NULL,
  col73 date DEFAULT NULL,
  col74 date DEFAULT NULL,
  col75 date DEFAULT NULL,
  col76 date DEFAULT NULL,
  col77 date DEFAULT NULL,
  col78 date DEFAULT NULL,
  col79 date DEFAULT NULL,
  col80 date DEFAULT NULL,
  col81 date DEFAULT NULL,
  col82 date DEFAULT NULL,
  col83 date DEFAULT NULL,
  col84 date DEFAULT NULL,
  col85 date DEFAULT NULL,
  col86 date DEFAULT NULL,
  col87 date DEFAULT NULL,
  col88 date DEFAULT NULL,
  col89 date DEFAULT NULL,
  col90 date DEFAULT NULL,
  col91 date DEFAULT NULL,
  col92 date DEFAULT NULL,
  col93 date DEFAULT NULL,
  col94 date DEFAULT NULL,
  col95 date DEFAULT NULL,
  col96 date DEFAULT NULL,
  col97 date DEFAULT NULL,
  col98 date DEFAULT NULL,
  col99 date DEFAULT NULL,
  col100 date DEFAULT NULL,
  col101 date DEFAULT NULL,
  col102 date DEFAULT NULL,
  col103 date DEFAULT NULL,
  col104 date DEFAULT NULL,
  col105 date DEFAULT NULL,
  col106 date DEFAULT NULL,
  col107 date DEFAULT NULL,
  col108 date DEFAULT NULL,
  col109 date DEFAULT NULL,
  col110 date DEFAULT NULL,
  col111 date DEFAULT NULL,
  col112 date DEFAULT NULL,
  col113 date DEFAULT NULL,
  col114 date DEFAULT NULL,
  col115 date DEFAULT NULL,
  col116 date DEFAULT NULL,
  col117 date DEFAULT NULL,
  col118 date DEFAULT NULL,
  col119 date DEFAULT NULL,
  col120 date DEFAULT NULL,
  col121 date DEFAULT NULL,
  col122 date DEFAULT NULL,
  col123 date DEFAULT NULL,
  col124 date DEFAULT NULL,
  col125 date DEFAULT NULL,
  col126 date DEFAULT NULL,
  col127 date DEFAULT NULL,
  col128 date DEFAULT NULL,
  col129 date DEFAULT NULL,
  col130 date DEFAULT NULL,
  col131 date DEFAULT NULL,
  col132 date DEFAULT NULL,
  col133 date DEFAULT NULL,
  col134 date DEFAULT NULL,
  col135 date DEFAULT NULL,
  col136 date DEFAULT NULL,
  col137 date DEFAULT NULL,
  col138 date DEFAULT NULL,
  col139 date DEFAULT NULL,
  col140 date DEFAULT NULL,
  col141 date DEFAULT NULL,
  col142 date DEFAULT NULL,
  col143 date DEFAULT NULL,
  col144 date DEFAULT NULL,
  col145 date DEFAULT NULL,
  col146 date DEFAULT NULL,
  col147 date DEFAULT NULL,
  col148 date DEFAULT NULL,
  col149 date DEFAULT NULL,
  col150 date DEFAULT NULL,
  col151 date DEFAULT NULL,
  col152 date DEFAULT NULL,
  col153 date DEFAULT NULL,
  col154 date DEFAULT NULL,
  col155 date DEFAULT NULL,
  col156 date DEFAULT NULL,
  col157 date DEFAULT NULL,
  col158 date DEFAULT NULL,
  col159 date DEFAULT NULL,
  col160 date DEFAULT NULL,
  col161 date DEFAULT NULL,
  col162 date DEFAULT NULL,
  col163 date DEFAULT NULL,
  col164 date DEFAULT NULL,
  col165 date DEFAULT NULL,
  col166 date DEFAULT NULL,
  col167 date DEFAULT NULL,
  col168 date DEFAULT NULL,
  col169 date DEFAULT NULL,
  col170 date DEFAULT NULL,
  col171 date DEFAULT NULL,
  col172 date DEFAULT NULL,
  col173 date DEFAULT NULL,
  col174 date DEFAULT NULL,
  col175 date DEFAULT NULL,
  col176 date DEFAULT NULL,
  col177 date DEFAULT NULL,
  col178 date DEFAULT NULL,
  col179 date DEFAULT NULL,
  col180 date DEFAULT NULL,
  col181 date DEFAULT NULL,
  col182 date DEFAULT NULL,
  col183 date DEFAULT NULL,
  col184 date DEFAULT NULL,
  col185 date DEFAULT NULL,
  col186 date DEFAULT NULL,
  col187 date DEFAULT NULL,
  col188 date DEFAULT NULL,
  col189 date DEFAULT NULL,
  col190 date DEFAULT NULL,
  col191 date DEFAULT NULL,
  col192 date DEFAULT NULL,
  col193 date DEFAULT NULL,
  col194 date DEFAULT NULL,
  col195 date DEFAULT NULL,
  col196 date DEFAULT NULL,
  col197 date DEFAULT NULL,
  col198 date DEFAULT NULL,
  col199 date DEFAULT NULL,
  col200 date DEFAULT NULL
)""".execute()(conn)

  sql"""CREATE TABLE sel_dates_50 (
  col1 date DEFAULT NULL,
  col2 date DEFAULT NULL,
  col3 date DEFAULT NULL,
  col4 date DEFAULT NULL,
  col5 date DEFAULT NULL,
  col6 date DEFAULT NULL,
  col7 date DEFAULT NULL,
  col8 date DEFAULT NULL,
  col9 date DEFAULT NULL,
  col10 date DEFAULT NULL,
  col11 date DEFAULT NULL,
  col12 date DEFAULT NULL,
  col13 date DEFAULT NULL,
  col14 date DEFAULT NULL,
  col15 date DEFAULT NULL,
  col16 date DEFAULT NULL,
  col17 date DEFAULT NULL,
  col18 date DEFAULT NULL,
  col19 date DEFAULT NULL,
  col20 date DEFAULT NULL,
  col21 date DEFAULT NULL,
  col22 date DEFAULT NULL,
  col23 date DEFAULT NULL,
  col24 date DEFAULT NULL,
  col25 date DEFAULT NULL,
  col26 date DEFAULT NULL,
  col27 date DEFAULT NULL,
  col28 date DEFAULT NULL,
  col29 date DEFAULT NULL,
  col30 date DEFAULT NULL,
  col31 date DEFAULT NULL,
  col32 date DEFAULT NULL,
  col33 date DEFAULT NULL,
  col34 date DEFAULT NULL,
  col35 date DEFAULT NULL,
  col36 date DEFAULT NULL,
  col37 date DEFAULT NULL,
  col38 date DEFAULT NULL,
  col39 date DEFAULT NULL,
  col40 date DEFAULT NULL,
  col41 date DEFAULT NULL,
  col42 date DEFAULT NULL,
  col43 date DEFAULT NULL,
  col44 date DEFAULT NULL,
  col45 date DEFAULT NULL,
  col46 date DEFAULT NULL,
  col47 date DEFAULT NULL,
  col48 date DEFAULT NULL,
  col49 date DEFAULT NULL,
  col50 date DEFAULT NULL
)""".execute()(conn)
}
