//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;
//import javax.xml.crypto.dsig.TransformService;
//import javax.xml.crypto.dsig.XMLSignatureFactory;
//import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.nio.charset.StandardCharsets;
//
//public class Cannonical
//{
//    public static void main(String[] args) throws Exception {
//        String xmlInput = """
//            <OrdSubmtDTCFnclMstr xmlns:java="http://xml.apache.org/xalan/java">
//                <OrdSubmtDTCFnclHdr AltInvcNbr="550051749" BillToCustNbr="0005070850" CRDDt="2024-10-18T20:25:27+00:00" CustPODt="2024-10-17T08:56:49+00:00" CustPONbr="ESW12755829" CustPOTypeCd="DCGC" DistribChnlCd="10" DivCd="98" EntCd="NIKEXA" FxdValDt="2024-10-17T08:56:49+00:00" OrdCnclDt="2024-11-17T20:25:27+00:00" RsnCd="176" ShipToId="0005070854" ShpgCondCd="" SlsOrgCd="7300" SoldToId="0005070854" SrcSysRefTxt="GR102032001071951" TypeCd="Z101" nCorrelationID="" nCorrelationType="CREDIT_MEMO">
//                    <OrdDTCFnclHdrAddrDtl Addr2Nm="C/O LI&amp;FUNG LOGISTICS" AddrFuncCd="WE" AddrNm="ESHOPWORLD" CityNm="SINGAPORE" CtryCd="SG" EMailAddrNm="" ProvStCd="SG" PstlCd="648165" StAddrLin2Desc="10 BULIM AVENUE" StAddrLin3Desc="WAREHOUSE 1B" TeleNbr=""/>
//                    <OrdDTCFnclHdrAddrDtl Addr2Nm="" Addr3Nm="C/O LI&amp;FUNG LOGISTICS" AddrFuncCd="ZI" AddrNm="ESHOPWORLD" CityNm="SINGAPORE" CtryCd="SG" EMailAddrNm="" ProvStCd="SG" PstlCd="648165" StAddrLin2Desc="10 BULIM AVENUE" StAddrLin3Desc="WAREHOUSE 1B" TeleNbr=""/>
//                    <OrdDTCFnclItm CRDDt="2024-10-18T20:25:27+00:00" LinItmNbr="1" VendProdCd="202410172057411108106906">
//                        <OrdDTCFnclItmAdjmt AdjmtCd="ZRSC" AdjmtItmAmt="6.98" CrncCd="USD" PrcUnitCnt="1"/>
//                        <OrdDTCFnclItmAdjmt AdjmtCd="ZRSN" AdjmtItmAmt="12.20" CrncCd="USD" PrcUnitCnt="1"/>
//                        <OrdDTCFnclItmAdjmt AdjmtCd="ZRPT" AdjmtItmAmt="21.17" CrncCd="USD" PrcUnitCnt="1"/>
//                        <OrdDTCFnclItmAdjmt AdjmtCd="ZIST" AdjmtDesc="Tax on IntServFee" AdjmtItmAmt="2.12" CrncCd="USD"/>
//                        <OrdDTCFnclSchedLnItm GTIN="00194500874961">
//                            <OrdDTCFnclSchedLnAmtDtl ItmQty="1.00"/>
//                        </OrdDTCFnclSchedLnItm>
//                    </OrdDTCFnclItm>
//                </OrdSubmtDTCFnclHdr>
//            </OrdSubmtDTCFnclMstr>
//            """;
//
//        // Parse XML
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        dbf.setNamespaceAware(true);
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document document = db.parse(new ByteArrayInputStream(xmlInput.getBytes(StandardCharsets.UTF_8)));
//
//        // Canonicalize XML
//        XMLSignatureFactory sigFactory = XMLSignatureFactory.getInstance("DOM");
//        TransformService transformService = TransformService.getInstance(
//                "http://www.w3.org/TR/2001/REC-xml-c14n-20010315",
//                "DOM"
//        );
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        transformService.init(new DOMSource(document), new StreamResult(baos), sigFactory.getKeyInfoFactory().getParameterSpec(C14NMethodParameterSpec.class));
//
//        // Output canonicalized XML
//        String canonicalizedXML = baos.toString(StandardCharsets.UTF_8);
//        System.out.println("Canonicalized XML:");
//        System.out.println(canonicalizedXML);
//    }
//}
//
//
