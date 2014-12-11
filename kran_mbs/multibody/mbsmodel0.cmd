!
! --------Units for Model --------
!
!
defaults units  &
   length = mm  &
   angle = deg  &
   force = newton  &
   mass = kg  &
   time = s
!
!
defaults units  &
   coordinate_system_type = cartesian  &
   orientation_type = body321
!
! --------Attributes for Model --------
!
!
defaults attributes  &
   inheritance = bottom_up  &
   icon_visibility = off  &
   grid_visibility = off  &
   size_of_icons = 50.0  &
   spacing_for_grid = 1000.0
!
view manage modify  &
   render = shaded
!
color create  &
   color_name = background_color_infinity  &
   red_component = 0.7568627450980392  &
   green_component = 0.796078431372549  &
   blue_component = 0.8862745098039215
!
view management modify  &
   background_color = background_color_infinity
!
! --------Adams Model --------
!
!
model create  &
   model_name = mbsmodel0
!
part create new_ground  &
   part_name =ground0
!
part delete  &
   part_name = ground
!
defaults model  &
   part_name = ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
color create  &
   color_name = ground0_color  &
   red_component = 0.5584606361231481  &
   green_component = 0.07397726914211311  &
   blue_component = 0.6382332299350101
!
part attributes  &
   part_name = .mbsmodel0.ground0  &
   color = ground0_color
!
! --------Part: mastMBSBodyElement_hauptausleger0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -69.99999999999999d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\hauptausleger0.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -69.99999999999999d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_hauptausleger0_color  &
   red_component = 0.1989721156926999  &
   green_component = 0.19300379728185546  &
   blue_component = 0.3449839048935234
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   color = mastMBSBodyElement_hauptausleger0_color
!
! --------Part: mastMBSBodyElement_spitzenauslegeradapter1 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, -8.333333333333268d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\spitzenauslegeradapter1.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, -8.333333333333268d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_spitzenauslegeradapter1_color  &
   red_component = 0.8202534250383279  &
   green_component = 0.9824205434020917  &
   blue_component = 0.9871752884584934
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   color = mastMBSBodyElement_spitzenauslegeradapter1_color
!
! --------Part: mastMBSBodyElement_spitzenauslegeradapter0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 180.0d, -86.66666666666657d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\spitzenauslegeradapter0.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 180.0d, -86.66666666666657d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_spitzenauslegeradapter0_color  &
   red_component = 0.42446730377792796  &
   green_component = 0.5516470200133787  &
   blue_component = 0.7267891603772856
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   color = mastMBSBodyElement_spitzenauslegeradapter0_color
!
! --------Part: mastMBSBodyElement_spitzenausleger0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 0.0d, -14.999999999999996d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\spitzenausleger0.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 0.0d, -14.999999999999996d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_spitzenausleger0_color  &
   red_component = 0.9591061092888727  &
   green_component = 0.7118191004950594  &
   blue_component = 0.576640488597877
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   color = mastMBSBodyElement_spitzenausleger0_color
!
! --------Part: mastMBSBodyElement_abspannbock0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -19.999999999999996d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\abspannbock0.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -19.999999999999996d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_abspannbock0_color  &
   red_component = 0.7282159573845578  &
   green_component = 0.5533588222488508  &
   blue_component = 0.5641204204772825
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   color = mastMBSBodyElement_abspannbock0_color
!
! --------Part: mastMBSBodyElement_nebenausleger0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -59.99999999999997d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\nebenausleger0.stl"  &
   part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -59.99999999999997d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   density = 7.8E-6
!
color create  &
   color_name = mastMBSBodyElement_nebenausleger0_color  &
   red_component = 0.9103516646986763  &
   green_component = 0.33971686576935556  &
   blue_component = 0.384102639067315
!
part attributes  &
   part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   color = mastMBSBodyElement_nebenausleger0_color
!
! --------Part: Unterbau --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.Unterbau  &
   location = -8000.0, -1750.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\unterbaumodel0.stl"  &
   part_name = .mbsmodel0.Unterbau  &
   location = -8000.0, -1750.0, 0.0  &
   orientation = 0.0d, -0.0d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.Unterbau  &
   density = 6.0E-7
!
color create  &
   color_name = Unterbau_color  &
   red_component = 0.21097270838647397  &
   green_component = 0.1300054615738946  &
   blue_component = 0.3648363334410122
!
part attributes  &
   part_name = .mbsmodel0.Unterbau  &
   color = Unterbau_color
!
! --------Part: seil1mbsbodyelement0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement0  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 31.482757272681976d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component0.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement0  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 31.482757272681976d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement0  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement0_color  &
   red_component = 0.010109890379065511  &
   green_component = 0.7902756976765531  &
   blue_component = 0.491691807136555
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement0  &
   color = seil1mbsbodyelement0_color
!
! --------Part: seil1mbsbodyelement1 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement1  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -82.19711931038589d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component1.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement1  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -82.19711931038589d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement1  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement1_color  &
   red_component = 0.11702753958025847  &
   green_component = 0.4373056395637035  &
   blue_component = 0.05948491655697652
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement1  &
   color = seil1mbsbodyelement1_color
!
! --------Part: seil1mbsbodyelement2 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement2  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 0.0d, -35.81443802878156d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component2.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement2  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 0.0d, -35.81443802878156d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement2  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement2_color  &
   red_component = 0.6460154100577573  &
   green_component = 0.7108289143491472  &
   blue_component = 0.8479452693058677
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement2  &
   color = seil1mbsbodyelement2_color
!
! --------Part: seil1mbsbodyelement3 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement3  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, 74.39595815751547d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component3.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement3  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, 74.39595815751547d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement3  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement3_color  &
   red_component = 0.7292918051126569  &
   green_component = 0.09645923287115044  &
   blue_component = 0.1740852680800249
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement3  &
   color = seil1mbsbodyelement3_color
!
! --------Part: seil1mbsbodyelement4 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement4  &
   location = 41888.3678583827, 0.0, 46573.95924757585  &
   orientation = 180.0d, -1.9030021333636888d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component4.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement4  &
   location = 41888.3678583827, 0.0, 46573.95924757585  &
   orientation = 180.0d, -1.9030021333636888d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement4  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement4_color  &
   red_component = 0.5235522025586895  &
   green_component = 0.582749276719978  &
   blue_component = 0.3380197579261287
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement4  &
   color = seil1mbsbodyelement4_color
!
! --------Part: seil1mbsbodyelement5 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil1mbsbodyelement5  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 56.91884204348246d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component5.stl"  &
   part_name = .mbsmodel0.seil1mbsbodyelement5  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 56.91884204348246d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil1mbsbodyelement5  &
   density = 1.0E-7
!
color create  &
   color_name = seil1mbsbodyelement5_color  &
   red_component = 0.9049578415169695  &
   green_component = 0.7286798869379232  &
   blue_component = 0.431583034342526
!
part attributes  &
   part_name = .mbsmodel0.seil1mbsbodyelement5  &
   color = seil1mbsbodyelement5_color
!
! --------Part: seil2mbsbodyelement0 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement0  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 180.0d, -74.39595815751547d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component6.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement0  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 180.0d, -74.39595815751547d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement0  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement0_color  &
   red_component = 0.6070418272709622  &
   green_component = 0.5790135263980537  &
   blue_component = 0.5591945686366969
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement0  &
   color = seil2mbsbodyelement0_color
!
! --------Part: seil2mbsbodyelement1 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement1  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 180.0d, 82.19711931038589d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component7.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement1  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 180.0d, 82.19711931038589d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement1  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement1_color  &
   red_component = 0.12313483238995049  &
   green_component = 0.837567990365406  &
   blue_component = 0.20981748784563803
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement1  &
   color = seil2mbsbodyelement1_color
!
! --------Part: seil2mbsbodyelement2 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement2  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, -31.482757272682004d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component8.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement2  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, -31.482757272682004d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement2  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement2_color  &
   red_component = 0.07453589121269044  &
   green_component = 0.7833311518215741  &
   blue_component = 0.10067793835936312
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement2  &
   color = seil2mbsbodyelement2_color
!
! --------Part: seil2mbsbodyelement3 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement3  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 0.0d, 1.9030021333636853d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component9.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement3  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 0.0d, 1.9030021333636853d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement3  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement3_color  &
   red_component = 0.9571753126172119  &
   green_component = 0.6741946240459923  &
   blue_component = 0.23805998070604484
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement3  &
   color = seil2mbsbodyelement3_color
!
! --------Part: seil2mbsbodyelement4 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement4  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 0.0d, -56.918842043482485d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component10.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement4  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 0.0d, -56.918842043482485d, 0.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement4  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement4_color  &
   red_component = 0.7459705846584637  &
   green_component = 0.5014483978159502  &
   blue_component = 0.6778800733902359
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement4  &
   color = seil2mbsbodyelement4_color
!
! --------Part: seil2mbsbodyelement5 --------
!
!
part create rigid_body name_and_position  &
   part_name = .mbsmodel0.seil2mbsbodyelement5  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 180.0d, 35.81443802878156d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
defaults coordinate_system  &
   default_coordinate_system = .mbsmodel0.ground0
!
file stereo_lithography read  &
   file_name = "C:/data-ossig/workspaces/Workspace/kran_mbs/multibody\geometry\component11.stl"  &
   part_name = .mbsmodel0.seil2mbsbodyelement5  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 180.0d, 35.81443802878156d, 180.0d
!
part create rigid_body mass_properties  &
   part_name = .mbsmodel0.seil2mbsbodyelement5  &
   density = 1.0E-7
!
color create  &
   color_name = seil2mbsbodyelement5_color  &
   red_component = 0.3631402439116743  &
   green_component = 0.2315476360536467  &
   blue_component = 0.9466059014370306
!
part attributes  &
   part_name = .mbsmodel0.seil2mbsbodyelement5  &
   color = seil2mbsbodyelement5_color
!
! --------Field Force:  --------
!
!
force create body gravitational  &
   gravity_field_name = Gravity  &
   x_component_gravity = 0.0  &
   y_component_gravity = 0.0  &
   z_component_gravity = -9.8
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement0_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement0  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 31.482757272681976d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement0_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement0
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement0hauptausleger0nebenausleger0_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement2  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement0
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement0hauptausleger0nebenausleger0_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement2
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement2_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement2  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, -31.482757272682004d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement2_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement2  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement2
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement1_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement1  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -82.19711931038589d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement1_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement1  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement1
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement1hauptausleger0spitzenauslegeradapter1_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement1  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement1  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement1
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement1hauptausleger0spitzenauslegeradapter1_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement1  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement1
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement1_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement1  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 180.0d, 82.19711931038589d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement1_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement1  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement1
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement2_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement2  &
   location = 5516.530016557318, 0.0, 40656.598307769775  &
   orientation = 0.0d, -35.81443802878156d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement2_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement2  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement2
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement2spitzenauslegeradapter1spitzenauslegeradapter0_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement2  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement5  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement2
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement2spitzenauslegeradapter1spitzenauslegeradapter0_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement2  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement5
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement5_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement5  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 180.0d, 35.81443802878156d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement5_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement5  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement5
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement3_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement3  &
   location = -15099.999999999993, 0.0, 22024.481438250088  &
   orientation = 0.0d, 74.39595815751547d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement3_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement3  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement3
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement3nebenausleger0abspannbock0_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement3  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement3
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement3nebenausleger0abspannbock0_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement3  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement0_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement0  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 180.0d, -74.39595815751547d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement0_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement4_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement4  &
   location = 41888.3678583827, 0.0, 46573.95924757585  &
   orientation = 180.0d, -1.9030021333636888d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement4_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement4  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement4
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement4spitzenausleger0spitzenauslegeradapter0_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement4  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement3  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement4
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement4spitzenausleger0spitzenauslegeradapter0_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement4  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement3
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement3_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement3  &
   location = 14956.841586778413, 0.0, 47468.78267793693  &
   orientation = 0.0d, 1.9030021333636853d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement3_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement3  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement3
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil1mbsbodyelement5_Joint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement5  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, 56.91884204348246d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement5_Joint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.seil1mbsbodyelement5  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement5
!
constraint create primitive_joint inline  &
   jprim_name = .mbsmodel0.seil1mbsbodyelement5hauptausleger0abspannbock0_Joint2_transl  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement5  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement4  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 90.0d, 0.0d  &
   relative_to = .mbsmodel0.seil1mbsbodyelement5
!
constraint create primitive_joint orientation  &
   jprim_name = seil1mbsbodyelement5hauptausleger0abspannbock0_Joint2_rot  &
   i_part_name = .mbsmodel0.seil1mbsbodyelement5  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement4
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.seil2mbsbodyelement4_Joint3_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement4  &
   location = -9953.725393815723, 0.0, 3597.615727276615  &
   orientation = 0.0d, -56.918842043482485d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.seil2mbsbodyelement4_Joint3_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.seil2mbsbodyelement4  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.seil2mbsbodyelement4
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.generaljoint0_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.Unterbau  &
   location = 0.0, 0.0, 400.0  &
   orientation = 0.0d, -69.99999999999999d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.generaljoint0_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   j_part_name = .mbsmodel0.Unterbau  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_hauptausleger0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.generaljoint1_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.Unterbau  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -19.999999999999996d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.generaljoint1_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_abspannbock0  &
   j_part_name = .mbsmodel0.Unterbau  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_abspannbock0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.generaljoint2_transl  &
   i_part_name = .mbsmodel0.Unterbau  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   location = -3000.0, 0.0, 1066.6666666666667  &
   orientation = 180.0d, -59.99999999999997d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.generaljoint2_rot  &
   i_part_name = .mbsmodel0.Unterbau  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_nebenausleger0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_nebenausleger0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.spitzenausleger0Joint0_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 0.0d, -14.999999999999996d, 0.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.spitzenausleger0Joint0_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_hauptausleger0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_spitzenausleger0
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.spitzenauslegeradapter1Joint0_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 13432.063125204875, 0.0, 39497.14343331181  &
   orientation = 180.0d, -8.333333333333268d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.spitzenauslegeradapter1Joint0_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter1
!
constraint create joint spherical  &
   joint_name = .mbsmodel0.spitzenauslegeradapter0Joint0_transl  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 15422.000218062232, 0.0, 39482.31741176678  &
   orientation = 180.0d, -86.66666666666657d, 180.0d  &
   relative_to = .mbsmodel0.ground0
!
constraint create primitive_joint parallel_axis  &
   jprim_name = .mbsmodel0.spitzenauslegeradapter0Joint0_rot  &
   i_part_name = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0  &
   j_part_name = .mbsmodel0.mastMBSBodyElement_spitzenausleger0  &
   location = 0.0, 0.0, 0.0  &
   orientation = 0.0d, 0.0d, -90.0d  &
   relative_to = .mbsmodel0.mastMBSBodyElement_spitzenauslegeradapter0
!
constraint create joint fixed  &
   joint_name = .mbsmodel0.FIXED1  &
   i_part_name = .mbsmodel0.Unterbau  &
   j_part_name = .mbsmodel0.ground0
!
view zoom  &
   auto = on
!
simulation script create  &
   sim_script_name = .mbsmodel0.simulation2  &
   initial_static = no  &
   end_time = 1.0  &
   step_size = 0.01
!
simulation single_run scripted  &
   model_name = mbsmodel0  &
   sim_script_name = simulation2  &
   reset_before_and_after = yes
