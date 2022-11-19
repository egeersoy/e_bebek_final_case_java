package e_bebek_final;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Menu {

    private final PatikaStore patikaStore;
    private final Scanner scanner;

    public Menu(PatikaStore patikaStore) {
        this.scanner = new Scanner(System.in);
        this.patikaStore = patikaStore;
        System.out.println(this.patikaStore.getName() + "'a hoşgeldiniz.");
    }

    void mainMenu() {
        System.out.println("1-) -Ürünleri listele-");
        System.out.println("2-) -Ürün sil-");
        System.out.println("3-) -Ürün ekle-");
        int selectedMenu = scanner.nextInt();
        switch (selectedMenu) {
            case 1:
                listMenu();
                break;
            case 2:
                deleteProductById();
                break;
            case 3:
                addProduct();
                break;
        }
        System.out.println("========================================");
        mainMenu();
    }

    private void deleteProductById() {
        System.out.println("Silinecek ürünün ID'sini giriniz:");
        String selectedItem = scanner.next();
        long matchedMobilePhones = patikaStore.getMobilePhones().stream().filter(it -> Objects.equals(it.getId(), selectedItem)).count();
        long matchedNoteBooks = patikaStore.getNoteBooks().stream().filter(it -> Objects.equals(it.getId(), selectedItem)).count();
        if (matchedMobilePhones + matchedNoteBooks == 0) {
            System.out.println("Ürün bulunamadı...Ana menüye dönülüyor.");
            return;
        }
        patikaStore.setMobilePhones(
                patikaStore.getMobilePhones()
                        .stream()
                        .filter(it -> !Objects.equals(it.getId(), selectedItem))
                        .collect(Collectors.toList())
        );
        patikaStore.setNoteBooks(
                patikaStore.getNoteBooks()
                        .stream()
                        .filter(it -> !Objects.equals(it.getId(), selectedItem))
                        .collect(Collectors.toList())
        );
        System.out.println("Ürün başarıyla silindi.");
    }

    private void addProduct() {
        System.out.println("1-) Telefonlar");
        System.out.println("2-) Notebooklar");
        int selectedCategory = scanner.nextInt();
        switch (selectedCategory) {
            case 1:
                addMobilePhone();
                return;
            case 2:
                addNoteBook();
                return;
            default:
                System.out.println("Yanlış seçim, ana menüye dönülüyor.");
        }
    }

    private void addNoteBook() {
        NoteBook noteBook = new NoteBook();
        noteBook.setId(UUID.randomUUID().toString());
        System.out.println("Brand:");
        String selectedBrand = scanner.next();
        Brand foundBrand = Brand.fromString(selectedBrand);
        if (foundBrand == null) {
            System.out.println("Marka bulunamadı, ana menüye dönülüyor.");
            return;
        }
        noteBook.setBrand(foundBrand);
        System.out.println("Discount Rate:");
        noteBook.setDiscountRate(scanner.nextDouble());
        System.out.println("Ram (GB):");
        noteBook.setRam(scanner.nextInt());
        System.out.println("Storage (GB):");
        noteBook.setStorage(scanner.nextInt());
        System.out.println("Product Name:");
        noteBook.setProductName(scanner.next());
        System.out.println("Stock:");
        noteBook.setStock(scanner.nextInt());
        System.out.println("Unit Price:");
        noteBook.setUnitPrice(scanner.nextDouble());
        System.out.println("Screen Size:");
        noteBook.setScreenSize(scanner.nextDouble());
        System.out.println("Notebook eklendi.");
        patikaStore.getNoteBooks().add(noteBook);
    }

    private void addMobilePhone() {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setId(UUID.randomUUID().toString());
        System.out.println("Brand:");
        String selectedBrand = scanner.next();
        Brand foundBrand = Brand.fromString(selectedBrand);
        if (foundBrand == null) {
            System.out.println("Marka bulunamadı, ana menüye dönülüyor.");
            return;
        }
        mobilePhone.setBrand(foundBrand);
        System.out.println("Discount Rate:");
        mobilePhone.setDiscountRate(scanner.nextDouble());
        System.out.println("Ram (GB):");
        mobilePhone.setRam(scanner.nextInt());
        System.out.println("Storage (GB):");
        mobilePhone.setStorage(scanner.nextInt());
        System.out.println("Product Name:");
        mobilePhone.setProductName(scanner.next());
        System.out.println("Stock:");
        mobilePhone.setStock(scanner.nextInt());
        System.out.println("Color:");
        mobilePhone.setColor(scanner.next());
        System.out.println("Screen Size:");
        mobilePhone.setScreenSize(scanner.nextDouble());
        System.out.println("Battery Power:");
        mobilePhone.setBatterPower(scanner.nextInt());
        System.out.println("Unit Price:");
        mobilePhone.setUnitPrice(scanner.nextInt());
        System.out.println("Telefon eklendi.");
        patikaStore.getMobilePhones().add(mobilePhone);
    }

    private void listMenu() {
        System.out.println("1-) -Hepsini listele-");
        System.out.println("2-) -Markaya göre listele-");
        System.out.println("3-) -Benzersiz numara ile listele-");
        System.out.println("4-) -Kategoriye göre listele-");
        int selectedMenu = scanner.nextInt();
        switch (selectedMenu) {
            case 1:
                System.out.println("Telefonlar:");
                patikaStore.getMobilePhones().forEach(System.out::println);
                System.out.println("Notebooklar:");
                patikaStore.getNoteBooks().forEach(System.out::println);
                break;
            case 2:
                System.out.println("Marka: ");
                String selectedBrand = scanner.next();
                Brand foundBrand = Brand.fromString(selectedBrand);
                if (foundBrand == null) {
                    System.out.println("Marka bulunamadı, ana menüye dönülüyor...");
                    return;
                }
                patikaStore.getMobilePhones().stream().filter(it -> it.getBrand() == foundBrand).forEach(System.out::println);
                patikaStore.getNoteBooks().stream().filter(it -> it.getBrand() == foundBrand).forEach(System.out::println);
                break;
            case 3:
                System.out.println("Benzersiz Numara:");
                String selectedId = scanner.next();
                Stream<MobilePhone> filteredMobilePhones = patikaStore.getMobilePhones().stream().filter(it -> Objects.equals(it.getId(), selectedId));
                Stream<NoteBook> filteredNoteBooks= patikaStore.getNoteBooks().stream().filter(it -> Objects.equals(it.getId(), selectedId));
                if (filteredNoteBooks.findAny().isEmpty() && filteredMobilePhones.findAny().isEmpty()) {
                    System.out.println("Bu ID'ye sahip ürün bulunamadı, ana menüye dönülüyor.");
                    return;
                }
                filteredMobilePhones.forEach(System.out::println);
                filteredNoteBooks.forEach(System.out::println);
                break;
            case 4:
                System.out.println("1-) Telefonlar");
                System.out.println("2-) Notebooklar");
                int selectedCategory = scanner.nextInt();
                if (selectedCategory == 1) {
                    patikaStore.getMobilePhones().forEach(System.out::println);
                }
                if (selectedCategory == 2) {
                    patikaStore.getNoteBooks().forEach(System.out::println);
                }
        }
    }
}
