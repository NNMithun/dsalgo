+------------------------+       +------------------------+       +------------------------+
|       Document         |<|-----|    DocumentCreator     |<|-----|   WordDocumentCreator  |
+------------------------+       +------------------------+       +------------------------+
| -open(): void          |       | -createDocument():     |       | -createDocument():     |
| -close(): void         |       |      Document          |       |      Document          |
| -save(): void          |       | -newDocument():        |       +------------------------+
| -revert(): void        |       |      Document          |
+------------------------+       +------------------------+

+------------------------+       +------------------------+
|    WordDocument        |       |   PdfDocumentCreator   |
+------------------------+       +------------------------+
| -open(): void          |       | -createDocument():     |
| -close(): void         |       |      Document          |
| -save(): void          |       +------------------------+
| -revert(): void        |

+------------------------+
|    PdfDocument         |
+------------------------+
| -open(): void          |
| -close(): void         |
| -save(): void          |
| -revert(): void        |
+------------------------+