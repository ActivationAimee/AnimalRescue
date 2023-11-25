drop table animal_search;

create table animal_search(					-- 실종동물,보호중동물 공고페이지
	ani_no number primary key,				-- 기본키, 글번호
	ani_subject varchar2(40) not null,		-- 글제목
	ani_content varchar2(1000) not null,	-- 글내용
	ani_area varchar2(100) not null, 		-- 실종,습득 장소
	ani_date date not null,					-- 실종,습득 일시
	ani_kind varchar2(20) not null,			-- 동물 종류
	ani_image varchar2(100) not null,		-- 이미지
	ani_name varchar2(20) not null,			-- 공고자 이름
	ani_tel	char(13) not null,				-- 공고자 연락처
	ani_id varchar2(20) not null,			-- 공고자 아이디(수정과 삭제할때 사용)
	ani_attribute number not null,			-- 실종동물찾기-0, 보호자찾기-1
	ani_now number not null					-- 동물/보호자 찾음-1, 못찾음-0(디폴트값)
);

insert into ANIMAL_SEARCH values(1,'강아지보호중입니다.','하얗고 동글동글하고 인식표착용중입니다.','area_daejeon',
								'2019-03-26','kind_dog','timo.jpg','김멍멍','010-1234-1234',1,0);
								
insert into ANIMAL_SEARCH values(2,'고양이를 찾고있습니다','까맣고 귀엽습니다..','area_busan',
								'2019-03-29','kind_cat','ex1.jpg','송냥냥','010-2345-2345',1,0);

select * from animal_search where ani_date between '2019-03-01' and '2019-04-01' and ani_attribute = 0;
								
delete from ANIMAL_SEARCH where ani_no = 1 or ani_no=2;

create table animal_w( 					-- �Ծ簡�� ���⵿��
	ani_no number primary key,				-- �۹�ȣ
	ani_subject varchar2(20) not null,		-- ������
	ani_content varchar2(1000) not null,	-- �۳���(������ ����)
	ani_area varchar2(100) not null, 		-- ����(��,��,��,����or����Ʈ����)
	ani_kind varchar2(20) not null,			-- ����
	ani_now number default 0 not null		-- �Ծ�Ϸ�=1, �̿Ϸ�=0
);


create table animal_adopt( 					-- �Ծ��û
	ani_no number primary key,				-- �۹�ȣ
	ani_subject varchar2(20) not null,		-- ������
	ani_content varchar2(1000) not null,	-- �۳���
	ani_tel	char(13) not null,				-- ��û�� ����ó
	ani_date date not null,					-- �Ծ� �����
	ani_pass varchar2(20) not null			-- �� ��й�ȣ
);

select max(ani_no) from animal_search;

select * from animal_search;

select * from animal_search where ani_attribute=1 order by ani_no asc;

select * from animal_search where ani_no=2;



drop table hospital;


drop table hospital;

create table hospital(
	hospitalnum number primary key,
	area varchar2(10) not null,
	name varchar2(30) not null,
	tel varchar2(20) not null,
	adress varchar2(60) not null,
	open varchar2(20) not null,
	maplat number not null,
	maplng number not null,
	content varchar2(1000) not null
);

insert into hospital values(1, '群馬県', 'おおとね動物病院', '+81 27-253-2212', '日本、371-0825 群馬県前橋市大利根町２丁目２−１４','10:00-18:00', 36.361032, 139.062425, '予約制ですので待ち時間少な目ですが、人気が有り中々予約がとれません。とても優しくて、丁寧な診察、お財布にも動物にも優しい先生です。');
insert into hospital values(2, '群馬県', 'アンフィニ村上動物病院', '+81 27-363-3621', '日本、370-0002 群馬県高崎市日高町４７７−１','10:00-18:00', 36.364551, 139.033073, '迅速な対応を的確にしていただける病院です。前回はありがとうございました。');
insert into hospital values(3, '東京都', 'まつき動物病院', '+81 3-5846-9822', '日本、〒101-0032 東京都千代田区岩本町１丁目２−１３','10:00-18:00', 35.691721, 139.776333, '初めて行きました。先生も看護師さんも気さくです。爪切りもお願いしましたが側で見てることもできて安心します。');
insert into hospital values(4, '東京都', 'フーレップ動物病院', '+81 3-5695-1122', '日本、〒103-0007 東京都中央区日本橋浜町２丁目４８−５','10:00-18:00', 35.686700, 139.788898, '清潔で明るい院内、先生の優しく落ち着いた対応に信頼感の持てる動物病院です。予約が取れるので待ち時間が軽減出来るのも◎。院内にいる看板猫ちゃんがとっても可愛くて癒されます');
insert into hospital values(5, '大阪府', '松原動物病院 センター', '+81 6-6354-4140', '日本、〒530-0043 大阪府大阪市北区天満３丁目２−１６','10:00-18:00',34.692992, 135.515064, '先日、延期になった腹腔鏡手術をしに行きました。11時までに病院に連れて来るようにということで10時過ぎから病院で待機。約1時間後に診察室に呼ばれました。前回と同じく院長先生が診てくれました。');
insert into hospital values(6, '大阪府', '大阪動物病院', '+81 6-6147-3903', '日本、〒531-0075 大阪府大阪市北区大淀南２丁目９−１０','10:00-18:00', 34.702146, 135.484925, '清潔感・高級感があって、良かったです。ペットホテルの利用でしたが、受付の女性も対応が良かったです。');

insert into hospital values(7, '大阪府', '新福島どうぶつ病院', '+81 6-6449-1133', '日本、〒553-0003 大阪府大阪市福島区福島４丁目２−６６−１F','10:00-18:00', 34.692648, 135.483969, '新しく迎え入れた仔猫が下痢をしたときとにかく早く診せたかったので朝早くの診療は本当に助かりました先生は非常に優しくて動物にも飼い主にも配慮してくださる方です');

insert into hospital values(1, '대전', '대전종합동물병원1', '042-442-1234', '대전광역시 서구 갈마동 1437','10:00-18:00', 36.347256, 127.377077, '매달 첫째주 월요일은 정기 휴일 입니다.');
insert into hospital values(2, '대전', '쿨펫동물병원둔산점2', '042-223-2233', '대전광역시 서구 탄방동 591','10:00-18:00', 36.347238, 127.386173, '탄방 홈플러스 4층에 있는 대전 최고의 동물 병원. 병원은 좁지만, 병원장이자 수의사님의 진료 수준은 다녀본 병원 중 최고');
insert into hospital values(3, '목포', '목포동물병원', '042-223-2233', '대전광역시 서구 탄방동 591','10:00-18:00', 34.798246, 126.390790, '탄방 홈플러스 4층에 있는 대전 최고의 동물 병원. 병원은 좁지만, 병원장이자 수의사님의 진료 수준은 다녀본 병원 중 최고');

select * from(select rownum rnum, data.* from(select * from hospital order by hospitalnum desc)data) where rnum >= 1 and rnum <= 5;

select * from(select rownum rnum from(select * from hospital));

SELECT * FROM (SELECT ROWNUM rnum, data.* FROM (SELECT num, name, subject, TO_CHAR(created, 'YYYY-MM-DD') created, hitCount FROM bbs ORDER BY num DESC) data)

WHERE rnum >= 4 AND rnum <= 6;

delete from HOSPITAL;

delete from HOSPITAL where hospitalnum = 12;

select * from HOSPITAL;

drop table support;

create table support(
	supportnum number primary key,
	title varchar2(20) not null,
	organization varchar2(10),
	name varchar2(4) not null,
	phone varchar2(20) not null,
	area varchar2(10) not null,
	content varchar2(1000)
);

drop table protect;

create table protect(
	protectnum number primary key,
	area varchar2(10) not null,
	name varchar2(30) not null,
	tel varchar2(20) not null,
	adress varchar2(60) not null,
	open varchar2(20) not null,
	maplat number not null,
	maplng number not null,
	content varchar2(1000) not null
);

insert into protect values(1, '대전', '대전종합동물병원1', '042-442-1234', '대전광역시 서구 갈마동 1437','10:00-18:00', 36.347256, 127.377077, '매달 첫째주 월요일은 정기 휴일 입니다.');
insert into protect values(2, '대전', '쿨펫동물병원둔산점2', '042-223-2233', '대전광역시 서구 탄방동 591','10:00-18:00', 36.347238, 127.386173, '탄방 홈플러스 4층에 있는 대전 최고의 동물 병원. 병원은 좁지만, 병원장이자 수의사님의 진료 수준은 다녀본 병원 중 최고');

select * from PROTECT;

delete from protect;

drop table member;

create table member(
	id varchar2(20) primary key,
	idnumber varchar2(13) not null,
	pass varchar2(20) not null,
	name varchar2(10) not null,
	phone varchar2(13)not null,
	age number not null,
	admin number not null
);

insert into MEMBER values('admin','1','123456','관리자','010-9988-4671',20,1);
insert into MEMBER values('dbsqud100','1234561234567','123456','차윤병','010-9988-4671',20,0);
delete from member;

select * from member;

create table animal_adopt( 					-- 입양신청
	ani_no number primary key,				-- 글번호
	ani_w number not null,					-- 원하는 동물의 글번호 animal_w에서의 ani_no 값
	ani_subject varchar2(20) not null,		-- 글제목
	ani_content varchar2(1000) not null,	-- 글내용
	ani_name varchar2(20) not null,			-- 신청자 이름
	ani_tel	char(13) not null,				-- 신청자 연락처
	ani_date date not null,					-- 입양 희망일
	ani_dday date not null,					-- 신청 날짜
	ani_pass varchar2(20) not null			-- 글 비밀번호
);

select * from animal_adopt;

insert into animal_adopt values(1,1,'제목','내용','성명','연락처','2019/01/01',sysdate,'1234');

select max(ani_no) from animal_adopt;

select * from ANIMAL_ADOPT where ani_no = 1;

drop table support;

create table support(
   snum number primary key,
   id varchar2(20) not null,
   name varchar2(20) not null,
   image varchar2(100) not null,
   phone varchar2(20) not null,
   account varchar2(20) not null,
   money number not null,
   subject varchar2(50) not null,
   content varchar2(1000) not null,
   dday date not null
   );
   
   select * from SUPPORT;
   select max(snum) from support;
   
   select * from(select rownum rnum from(select * from support));
   
   select max(snum) from support;
   
   select * from(select rownum rnum, data.* from(select * from support order by snum desc)data) where rnum >= 1 and rnum <= 10;