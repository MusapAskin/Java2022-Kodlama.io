USE [ABCBank]
GO
/****** Object:  Table [dbo].[Adresses]    Script Date: 11/8/2022 5:52:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Adresses](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[customerID] [int] NOT NULL,
	[countryID] [int] NOT NULL,
	[cityID] [int] NOT NULL,
	[districtID] [int] NOT NULL,
	[adressDetails] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Adresses] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Adresses]  WITH CHECK ADD  CONSTRAINT [FK_Adresses_Cities] FOREIGN KEY([cityID])
REFERENCES [dbo].[Cities] ([ID])
GO
ALTER TABLE [dbo].[Adresses] CHECK CONSTRAINT [FK_Adresses_Cities]
GO
ALTER TABLE [dbo].[Adresses]  WITH CHECK ADD  CONSTRAINT [FK_Adresses_Countries] FOREIGN KEY([countryID])
REFERENCES [dbo].[Countries] ([ID])
GO
ALTER TABLE [dbo].[Adresses] CHECK CONSTRAINT [FK_Adresses_Countries]
GO
ALTER TABLE [dbo].[Adresses]  WITH CHECK ADD  CONSTRAINT [FK_Adresses_Customers] FOREIGN KEY([customerID])
REFERENCES [dbo].[Customers] ([ID])
GO
ALTER TABLE [dbo].[Adresses] CHECK CONSTRAINT [FK_Adresses_Customers]
GO
ALTER TABLE [dbo].[Adresses]  WITH CHECK ADD  CONSTRAINT [FK_Adresses_Districts] FOREIGN KEY([districtID])
REFERENCES [dbo].[Districts] ([ID])
GO
ALTER TABLE [dbo].[Adresses] CHECK CONSTRAINT [FK_Adresses_Districts]
GO
