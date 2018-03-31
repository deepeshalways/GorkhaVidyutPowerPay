package com.example.popla.gorkhavidyutpowerpay.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BILL_DETAILS".
*/
public class Bill_detailsDao extends AbstractDao<Bill_details, Long> {

    public static final String TABLENAME = "BILL_DETAILS";

    /**
     * Properties of entity Bill_details.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Bill_id = new Property(0, Long.class, "Bill_id", true, "BILL_ID");
        public final static Property K_no = new Property(1, String.class, "k_no", false, "K_NO");
        public final static Property Current_read = new Property(2, String.class, "current_read", false, "CURRENT_READ");
        public final static Property Generated_date = new Property(3, java.util.Date.class, "generated_date", false, "GENERATED_DATE");
        public final static Property Due_date = new Property(4, String.class, "due_date", false, "DUE_DATE");
        public final static Property Paid_by = new Property(5, String.class, "paid_by", false, "PAID_BY");
        public final static Property TimeStamp = new Property(6, Long.class, "TimeStamp", false, "TIME_STAMP");
    }


    public Bill_detailsDao(DaoConfig config) {
        super(config);
    }
    
    public Bill_detailsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BILL_DETAILS\" (" + //
                "\"BILL_ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: Bill_id
                "\"K_NO\" TEXT," + // 1: k_no
                "\"CURRENT_READ\" TEXT," + // 2: current_read
                "\"GENERATED_DATE\" INTEGER," + // 3: generated_date
                "\"DUE_DATE\" TEXT," + // 4: due_date
                "\"PAID_BY\" TEXT," + // 5: paid_by
                "\"TIME_STAMP\" INTEGER);"); // 6: TimeStamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BILL_DETAILS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bill_details entity) {
        stmt.clearBindings();
 
        Long Bill_id = entity.getBill_id();
        if (Bill_id != null) {
            stmt.bindLong(1, Bill_id);
        }
 
        String k_no = entity.getK_no();
        if (k_no != null) {
            stmt.bindString(2, k_no);
        }
 
        String current_read = entity.getCurrent_read();
        if (current_read != null) {
            stmt.bindString(3, current_read);
        }
 
        java.util.Date generated_date = entity.getGenerated_date();
        if (generated_date != null) {
            stmt.bindLong(4, generated_date.getTime());
        }
 
        String due_date = entity.getDue_date();
        if (due_date != null) {
            stmt.bindString(5, due_date);
        }
 
        String paid_by = entity.getPaid_by();
        if (paid_by != null) {
            stmt.bindString(6, paid_by);
        }
 
        Long TimeStamp = entity.getTimeStamp();
        if (TimeStamp != null) {
            stmt.bindLong(7, TimeStamp);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bill_details entity) {
        stmt.clearBindings();
 
        Long Bill_id = entity.getBill_id();
        if (Bill_id != null) {
            stmt.bindLong(1, Bill_id);
        }
 
        String k_no = entity.getK_no();
        if (k_no != null) {
            stmt.bindString(2, k_no);
        }
 
        String current_read = entity.getCurrent_read();
        if (current_read != null) {
            stmt.bindString(3, current_read);
        }
 
        java.util.Date generated_date = entity.getGenerated_date();
        if (generated_date != null) {
            stmt.bindLong(4, generated_date.getTime());
        }
 
        String due_date = entity.getDue_date();
        if (due_date != null) {
            stmt.bindString(5, due_date);
        }
 
        String paid_by = entity.getPaid_by();
        if (paid_by != null) {
            stmt.bindString(6, paid_by);
        }
 
        Long TimeStamp = entity.getTimeStamp();
        if (TimeStamp != null) {
            stmt.bindLong(7, TimeStamp);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Bill_details readEntity(Cursor cursor, int offset) {
        Bill_details entity = new Bill_details( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // Bill_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // k_no
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // current_read
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // generated_date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // due_date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // paid_by
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6) // TimeStamp
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bill_details entity, int offset) {
        entity.setBill_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setK_no(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCurrent_read(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGenerated_date(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setDue_date(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPaid_by(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTimeStamp(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Bill_details entity, long rowId) {
        entity.setBill_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Bill_details entity) {
        if(entity != null) {
            return entity.getBill_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bill_details entity) {
        return entity.getBill_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
