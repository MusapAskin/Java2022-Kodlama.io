USE [ABCBank]
GO
/****** Object:  Table [dbo].[Individual]    Script Date: 11/8/2022 5:52:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Individual](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[individualName] [varchar](50) NULL,
	[individualSurname] [varchar](50) NULL,
	[tcNo] [varchar](11) NULL,
	[balanceID] [int] NULL,
 CONSTRAINT [PK_Customers] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Individual]  WITH CHECK ADD  CONSTRAINT [FK_Individual_Balance] FOREIGN KEY([balanceID])
REFERENCES [dbo].[Balance] ([ID])
GO
ALTER TABLE [dbo].[Individual] CHECK CONSTRAINT [FK_Individual_Balance]
GO
