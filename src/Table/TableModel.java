/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Nirmith Akash
 */
public final class TableModel {
    public TableModel(){
        
    }
    //Direct Tables
    //Create Table Details for Menu Table 
    public static class Menutable{
        public static final String TABLE_NAME = "menu_table";
        public static final String COL1 = "menu_id";
        public static final String COL2 = "menu_name";
        public static final String COL3 = "discount";
    }
    
    //Create Table Details for Item Table
    public static class Itemtable{
        public static final String TABLE2_NAME = "item_table";
        public static final String COL1_1 = "id";
        public static final String COL1_2 = "item_name";
        public static final String COL1_3 = "price";
    }
    
    //Create Ingredients table details 
    public static class Ingredienttable{
        public static final String TABLE3_NAME = "ingred_table";
        public static final String COL2_2 = "ingred_id";
        public static final String COL2_3 = "ingred_name";
    }
    
    //Create Menu -> Item Table 
    public static class MenuItemTable {
        public static final String TABLE4_NAME = "menu_food_table";
        public static final String COL3_1 = "menu_id";
        public static final String COL3_2 = "item_id";

        public static void setRowSorter(TableRowSorter<DefaultTableModel> tr) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    //Create Menu -> Ingred Table
    public static class ItemIngredTable{
        public static final String TABLE5_NAME = "item_ingre_table";
        public static final String COL4_1 = "id";
        public static final String COL4_2 = "item_id";
        public static final String COL4_3 = "ingred_id";
        public static final String COL4_4 = "amount";
    }
    
    //Creating table Order
    public static class OrderTable{
        public static final String TABLE6_NAME = "order_table";
        public static final String COL5_1 = "order_id";
        public static final String COL5_2 = "menu_name";
        public static final String COL5_3 = "quantity";
        public static final String COL5_4 = "status";
        public static final String COL5_5 = "date";
        public static final String COL5_6 = "room_number";
        public static final String COL5_7 = "user_name";     
    }
    
    //Create a table for order item details 
    public static class OrderItemTable{
        public static final String TABLE7_NAME = "order_item_table";
        public static final String COL6_1 = "id";
        public static final String COL6_2 = "order_id";
        public static final String COL6_3 = "item_id";
        
    }
    
    
    //Virtual Tables
    //Menu -> Item table creation 
    public static class MenuandItemvtable{
        public static final String SELECT = "mf.id, m.menu_name, i.item_name";
        public static final String FROM = "item_table i, menu_table m, menu_food_table mf";
        public static final String WHERE = "(i.id = mf.item_id) AND (m.menu_id = mf.menu_id)";
    }
    
    //Item -> Ingred table creation
    public static class ItemIngredvtable {
        public static final String SELECT1 = "iig.id, i.item_name, ig.ingred_name, iig.amount";
        public static final String FROM1 = "item_table i, ingred_table ig, item_ingre_table iig";
        public static final String WHERE1 = "(i.id = iig.item_id) and (ig.ingred_id = iig.ingred_id)";
    }
    
    //Update function related codes
    public static class UpdateMenuItem{
        
    }
    
    //Salitha Table content
    public static class customerDetailsTable{
        public static final String Reception_TABLE_NAME = "customer";
        public static final String Reception_COL1 = "CID";
        public static final String Reception_COL2 = "CName";
        public static final String Reception_COL3 = "Cemail";
        public static final String Reception_COL4 = "Address";
        public static final String Reception_COL5 = "Nationality";
        public static final String Reception_COL6 = "NIC";
        public static final String Reception_COL7 = "PassportNo";
    }
    public static class customerPhoneDetailsTable{
        public static final String Reception_TABLE_NAME_1 = "customer_phone";
        public static final String Reception_COL1_1 = "Customer_CID";
        public static final String Reception_COL2_1= "Phone_num";
        public static final String Reception_COL3_1= "Phone_ID";
    }
    public static class BookingTable{
        public static final String Reception_TABLE_NAME_2 = "booking";
        public static final String Reception_COL1_2 = "BID";
        public static final String Reception_COL2_2 = "Startdate";
        public static final String Reception_COL3_2 = "NoofDays";
        public static final String Reception_COL4_2 = "VIP";
        public static final String Reception_COL5_2 = "Assigned_Rooms";
        public static final String Reception_COL6_2 = "CID";
        public static final String Reception_COL7_2 = "PID";
    }
    
    //Taneeshas' Table Content
        public static class Room{
        public static final String TABLE_Room = "room";
        public static final String rid = "RID";
        public static final String room_type = "Type";
        public static final String floor_no =  "Floor_No";
        public static final String room_category = "Category";
        public static final String room_status = "Status";
        public static final String room_package = "Package_name";
        public static final String room_phoneno = "Phone_No";
        public static final String room_adults = "Max_Adults";
        public static final String room_childrens = "MaxChildren";
        public static final String room_description = "Description";
        
    }
    
    public static class Package{
        public static final String TABLE_Package = "package";
        public static final String pid = "PID";
        public static final String roompackage_name = "Name";
        public static final String package_price = "Price";
        public static final String package_dis = "Discount";
    }
    
    public static class Facility{
        public static final String TABLE_Facility = "facility";
        public static final String fid = "fID";
        public static final String room_facility_name = "name";
    
    }
    
    public static class RoomOtherRequest{
        public static final String TABLE_OtherRequest = "room_other_request";
        public static final String rsnid = "RSNID";
        public static final String roominventory_item = "InventoryItem";
        public static final String inventory_item_quantity =  "Quantity";
        public static final String inventory_item_amount = "Amount";
        public static final String requested_date = "Date";
        public static final String room_cutID = "Booking_BID";
        //public static final String COL7_4 = "ExtraExpences_ExID";
        //public static final String COL8_4 = "RequestableItemsInventory_InID";

    }
    
    //pacakge and facility Many to many relationship table
    public static class PackageFacilityTable{
        public static final String TABLE_PackageFacility = "package_facility_table";
        //public static final String COL1_5 = "id";
        public static final String pidnew = "PID";
        public static final String fidnew = "fID";
    
    }
    
    //virtual table
    public static class PackageFacilityvTable{
        public static final String SELECTNEW = "pf.id, p.Name, f.name";
        public static final String FROMNew = "package p, facility f, package_facility_table pf";
        public static final String WHERENEW = "(f.FID = pf.fID) AND (p.PID = pf.PID)";
    }
    
    
    //Menaka's Table structures
    public static class LiquorInventory{
        public static final String BAR_Tb_N1 = "liquoritemsinventory";
        public static final String BAR_COL_1 = "InID";
        public static final String BAR_COL_2 = "Name";
        public static final String BAR_COL_3 = "Size";
        public static final String BAR_COL_4 = "Brand";
        public static final String BAR_COL_5 = "NoOfStock";
        public static final String BAR_COL_6= "UnitPrice";
    }
    public static class BOrder{
        public static final String BAR_Tb_N2 = "BarOrder";
        public static final String BAR_COL2_3 = "totalPrice";
        public static final String BAR_COL2_4 = "Discount";
        public static final String BAR_COL2_5 = "netAmount";
        public static final String BAR_COL2_6 = "ExtraExpences_ExID";
        public static final String BAR_COL2_7= "Booking_BID";
    }
    public static class BarBillInvoice{
        public static final String BAR_Tb_N3 = "bar_bill_invoice";
        public static final String BAR_COL3_1 = "bb_invoice_No";
        public static final String BAR_COL3_2 = "item_ID";
        public static final String BAR_COL3_3 = "Name";
        public static final String BAR_COL3_4 = "Brand";
        public static final String BAR_COL3_5 = "Size";
        public static final String BAR_COL3_6 = "UnitPrice";
        public static final String BAR_COL3_7 = "Quntity";
        public static final String BAR_COL3_8 = "TotalPrice";
        public static final String BAR_COL3_9= "BarID";
    }
    
    
}
