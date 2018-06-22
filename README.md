# StudentCourseMangement
学生选课系统

```sql
/*
Navicat SQL Server Data Transfer

Source Server         : sqlserver_localhost
Source Server Version : 100000
Source Host           : localhost:1433
Source Database       : Student
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 100000
File Encoding         : 65001

Date: 2018-06-22 17:32:18
*/


-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE [class]
GO
CREATE TABLE [class] (
[id] varchar(255) NOT NULL ,
[name] varchar(255) NOT NULL ,
[teacher] varchar(255) NOT NULL ,
[number] varchar(255) NOT NULL 
)


GO

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN TRANSACTION
GO
INSERT INTO [class] ([id], [name], [teacher], [number]) VALUES (N'42fc41ae-237d-468c-8323-46d092478db9', N'a', N'a', N'a'), (N'a6d86567-ee3b-4c88-99c0-ac33d085b39d', N'w', N'w', N'd')
GO
GO
COMMIT TRANSACTION
GO

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE [user]
GO
CREATE TABLE [user] (
[id] varchar(255) NOT NULL ,
[username] varchar(255) NOT NULL ,
[password] varchar(255) NOT NULL 
)


GO

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN TRANSACTION
GO
INSERT INTO [user] ([id], [username], [password]) VALUES (N'1', N'祝轶男', N'1'), (N'2', N'江松蔚', N'2'), (N'3', N'赵道元', N'3'), (N'4', N'肖祇君', N'4')
GO
GO
COMMIT TRANSACTION
GO

-- ----------------------------
-- Table structure for userclass
-- ----------------------------
DROP TABLE [userclass]
GO
CREATE TABLE [userclass] (
[id] varchar(255) NOT NULL ,
[username] varchar(255) NOT NULL ,
[classname] varchar(255) NOT NULL ,
[classteacher] varchar(255) NOT NULL ,
[classnumber] varchar(255) NOT NULL ,
[sum] varchar(255) NULL 
)


GO

-- ----------------------------
-- Records of userclass
-- ----------------------------
BEGIN TRANSACTION
GO
INSERT INTO [userclass] ([id], [username], [classname], [classteacher], [classnumber], [sum]) VALUES (N'd04d667a-995c-4b03-8eef-92607bed1316', N'', N'a', N'a', N's', null), (N'2c33b966-5571-4eae-ae68-14ace63ccb2f', N'jsw', N'数据库', N'高璐', N'206', null), (N'6a158690-b4d7-427d-9cb3-554a968b224b', N'江松蔚', N'JAVA', N'于洪', N'A', null), (N'06d8bf6d-5e21-49b7-bf1f-47a3d705e2ca', N'', N'JAVA', N'于洪', N'A', null)
GO
GO
COMMIT TRANSACTION
GO

-- ----------------------------
-- Indexes structure for table class
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table class
-- ----------------------------
ALTER TABLE [class] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table user
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table user
-- ----------------------------
ALTER TABLE [user] ADD PRIMARY KEY ([id])
GO

```
