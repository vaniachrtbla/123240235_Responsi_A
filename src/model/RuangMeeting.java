/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class RuangMeeting extends ItemHotel {
    private String kapasitasOrang;
    private String fasilitas;
    
    public RuangMeeting(int id, String namaItem, String hargaPerMalam,
            String kapasitasOrang, String fasilitas) {
        
        super(id, namaItem, hargaPerMalam);
        
        this.kapasitasOrang = kapasitasOrang;
        this.fasilitas = fasilitas;
    }
    
    public String getkapasitasOrang() {
        return kapasitasOrang;
    }
    
    public String getfasilitas() {
        return fasilitas;
    }
    
    public void setkapasitasOrang(String kapasitasOrang) {
        this.kapasitasOrang = kapasitasOrang;
    }
    
    public void setfasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    
    @Override
    public String tampilInfo() {
        return "Ruang Meeting : " + namaItem;
    }
}
