USE [ABCBank]
GO
/****** Object:  Table [dbo].[Channels]    Script Date: 11/8/2022 5:52:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Channels](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[channelsName] [varchar](50) NULL,
 CONSTRAINT [PK_Channels] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
